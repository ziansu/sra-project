public static void ListContacts(Messenger esql, java.lang.String authorisedUser) {
    try {
        java.lang.String query = "SELECT ULC.list_member " + ((("FROM USR U, USER_LIST UL, USER_LIST_CONTAINS ULC " + "WHERE U.login = login ") + "AND UL.list_id = U.contact_list ") + "AND ULC.list_id = UL.list_id ");
        java.lang.String query = "SELECT ULC.list_member " + ("FROM USR U, USER_LIST UL, USER_LIST_CONTAINS ULC " + "WHERE U.login = authorisedUser AND UL.list_id = U.contact_list AND ULC.list_id = UL.list_id ");
        int rowCount = esql.executeQuery(query);
        java.lang.System.out.println(("total contacts: " + rowCount));
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(e.getMessage());
    }
}