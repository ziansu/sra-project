public java.sql.ResultSet getAllComputer() {
    java.lang.String selectAllComputer = "select computer.id, computer.name, computer.introduced, computer.discontinued ," + "company.id as company_id, company.name as companyName from computer left join company on computer.company_id = company.id";
    fr.ebiz.computerDatabase.persistance.ComputerDAO.statement = fr.ebiz.computerDatabase.persistance.ComputerDAO.c.getConnection();
    java.sql.ResultSet rs = null;
    try {
        rs = fr.ebiz.computerDatabase.persistance.ComputerDAO.statement.executeQuery(selectAllComputer);
    } catch (java.sql.SQLException e) {
        fr.ebiz.computerDatabase.persistance.ComputerDAO.logger.error("Error in function getAllComputer");
    }
    return rs;
}