public static java.lang.String getPersonAgency(java.lang.String username) throws controllers.IOException {
    controllers.ArrayList<java.lang.String> groups = controllers.User.getPerson(username).getGroups();
    java.lang.String agency;
    if (groups.contains("GROUP_idss_view"))
        groups.remove("GROUP_idss_view");
    
    if (groups.contains("GROUP_idss_edit"))
        groups.remove("GROUP_idss_edit");
    
    if (groups.contains("GROUP_idss_admin"))
        groups.remove("GROUP_idss_admin");
    
    agency = groups.get(0).replace("GROUP_", "");
    return agency;
}