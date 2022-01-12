@java.lang.Override
protected ua.goit.java5.group62.model.Company createEntry(java.sql.ResultSet resultSet) {
    ua.goit.java5.group62.model.Company company = new ua.goit.java5.group62.model.Company();
    try {
        company.setComment(resultSet.getString("comment"));
        company.setAddress(resultSet.getString("address"));
        company.setName(resultSet.getString("name"));
        company.setId(resultSet.getLong(ua.goit.java5.group62.DAO.jdbc.CompanyDaoJdbc.ID_COLUMN_NAME));
    } catch (java.sql.SQLException e) {
        throw new java.lang.RuntimeException("Couldn't retrieve results from Result set for company ResulSet");
    }
    return company;
}