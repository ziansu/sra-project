public static boolean UserExists(Messenger esql, java.lang.String userId) {
    try {
        java.lang.String query = java.lang.String.format("SELECT * FROM Usr WHERE login = '%s'", userId);
        int userNum = esql.executeQuery(query);
        if (userNum != 1) {
            java.lang.System.out.print("\tError, can not find user!\n");
            return false;
        }
        return true;
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(e.getMessage());
        return false;
    }
}