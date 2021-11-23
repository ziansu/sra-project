public boolean checkUsername(java.lang.String username) {
    java.lang.String uN = username;
    if ((((uN.length()) == 9) && (isNumeric(uN.substring(6)))) || ((isNumeric(uN)) && ((uN.length()) == 9))) {
        return true;
    }else {
        servlet.addUser.message += "#Username format incorrect (.example XXXYYY001) " + "\n";
        return false;
    }
}