public boolean verifyUserName(java.lang.String userName) {
    java.lang.System.out.println("Verifying username");
    if (containsUsername(userName)) {
        return false;
    }
    if ((userName.length()) > 12) {
        return false;
    }
    if ((userName.trim()) == "") {
        return false;
    }
    return true;
}