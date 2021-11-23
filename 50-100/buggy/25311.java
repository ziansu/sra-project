public com.eliftech.jurimik.model.Company lazyGet(long id) throws com.eliftech.jurimik.exception.UnknownCompanyException, java.sql.SQLException {
    java.lang.String query = ("SELECT * FROM company WHERE id = " + id) + ";";
    java.sql.ResultSet rs = new com.eliftech.jurimik.repository.Connector().executeQuery(query);
    if (!(rs.next())) {
        rs.close();
        throw new com.eliftech.jurimik.exception.UnknownCompanyException(("No company with this id:" + id));
    }else {
        com.eliftech.jurimik.model.Company result = com.eliftech.jurimik.util.CompanyConverter.lazyConvertCompanyFromResultSet(rs);
        rs.close();
        return result;
    }
}