public static void main(java.lang.String[] args) {
    minor.Database db = new minor.Database("root", "test", "192.168.1.108", "interval");
    try {
        minor.matchmaker.PlayerData user = db.getUser("rutger");
        java.lang.String newUUID = java.util.UUID.randomUUID().toString();
        java.lang.System.out.println(("Hallo " + newUUID));
        db.setUUID(newUUID, user);
        java.lang.System.out.println("...");
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}