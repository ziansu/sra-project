public static void main(java.lang.String[] args) {
    try {
        mmtweet.dao.AccessDB db = new mmtweet.dao.AccessDB();
        mmtweet.pojos.Location loc1 = new mmtweet.pojos.Location(12.123456, 24.123456);
        db.init();
        db.destroy();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Error!!");
    }
    java.lang.System.out.println("Done");
}