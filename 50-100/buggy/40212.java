private boolean connectToDatabase() {
    if (isConnectionClosed()) {
        java.lang.System.out.println("connection...");
        try {
            java.lang.Class.forName("org.sqlite.JDBC");
            this.c = java.sql.DriverManager.getConnection("jdbc:sqlite:data/MemberRegistry.db");
            return true;
        } catch (java.lang.Exception e) {
            java.lang.System.out.println("WOOPSIE");
            e.printStackTrace();
            return false;
        }
    }else {
        return false;
    }
}