public static boolean add(com.eliftech.jurimik.model.Company company) {
    java.lang.String query = ((((("INSERT INTO company (name, earnings, parent) VALUES ('" + (company.getName())) + "', '") + (company.getEarnings())) + "', '") + ((company.getParent()) == null ? "0" : company.getParent().getId())) + "');";
    if ((com.eliftech.jurimik.repository.Connector.executeUpdate(query)) > 0)
        return true;
    
    return false;
}