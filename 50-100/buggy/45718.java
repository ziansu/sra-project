public boolean logedIn(java.lang.String logindata) {
    if (logindata == null) {
        return false;
    }
    java.lang.System.out.println(logindata);
    java.lang.String[] data = logindata.split("-");
    if (BearbeitungsModule.Ueberpruefer.loginUberpruefung(benutzer, data[0], data[1])) {
        return true;
    }
    return false;
}