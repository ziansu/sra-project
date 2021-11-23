public static void main(java.lang.String[] argv) throws java.sql.SQLException {
    JudgeCDB obj = new JudgeCDB(java.lang.System.getProperty("user.dir"), argv[0]);
    obj.init();
    obj.connect();
    obj.getScores();
    obj.fetchSub();
    java.lang.System.out.println("Goodbye!");
}