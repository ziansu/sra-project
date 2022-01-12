public void infoCheck() {
    dirCheck = new java.io.File("K:\\Table Games\\Chipper\\java");
    if (dirCheck.exists()) {
        FUND = new java.io.File("K:\\Table Games\\Chipper\\java", "FUND");
        java.lang.System.out.println("K:\\Table Games\\Chipper\\java\\FUND");
    }
    if (dirCheck.exists())
        dirTrue = true;
    else {
        java.lang.System.out.println("DIRECTORY DOES NOT EXIST! Using current DIR.");
        FUND = new java.io.File(java.lang.System.getProperty("user.dir"), "FUND");
    }
}