public static java.lang.String getRating(java.lang.String login, int fid) throws java.lang.Exception {
    java.util.ArrayList<java.lang.String[]> ret = DatabaseInterface.SQLExecutor.executeQuery((((("SELECT rating FROM acmdb05.Rates WHERE login='" + login) + "' AND fid=") + fid) + ";"));
    return ret.get(0)[0];
}