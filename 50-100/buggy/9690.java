public static void main(java.lang.String[] args) {
    dao.CustomerDB db = new dao.CustomerDB("remoteuser", "password");
    java.lang.String[] stringValues = db.readAllValues(2);
    for (int i = 0; i < 7; i++) {
        java.lang.System.out.print(((stringValues[i]) + " "));
    }
}