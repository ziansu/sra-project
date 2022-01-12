private void readCompanies(int id, model.Developer developer, java.sql.Connection connection) throws java.sql.SQLException {
    java.sql.PreparedStatement ps = connection.prepareStatement("SELECT company_id FROM companies_developers WHERE developer_id = ?");
    ps.setInt(1, id);
    java.sql.ResultSet rs = ps.executeQuery();
    java.util.List<java.lang.Integer> companiesIds = new java.util.ArrayList<>();
    while (rs.next()) {
        companiesIds.add(rs.getInt(1));
    } 
    developer.setCompaniesIds(companiesIds);
}