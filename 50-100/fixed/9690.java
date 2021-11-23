public static void main(java.lang.String[] args) {
    dao.CustomerDB db = new dao.CustomerDB("remoteuser", "password");
    java.lang.String[][] stringValues = db.readAllValues();
    for (int i = 0; i < (stringValues.length); i++) {
        for (int j = 1; j < 7; j++) {
            java.lang.System.out.print(((stringValues[i][j]) + " "));
        }
        java.lang.System.out.println();
    }
}