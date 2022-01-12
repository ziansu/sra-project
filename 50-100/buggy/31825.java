public boolean hasSpace(java.lang.String password) {
    for (int i = 0; i < ((password.length()) - 1); i++) {
        if (java.lang.Character.isSpaceChar(password.charAt(i))) {
            return true;
        }
    }
    return false;
}