public java.lang.Boolean isOnline() {
    try {
        final java.lang.Process p1 = java.lang.Runtime.getRuntime().exec("ping -c 1 www.google.com");
        int returnVal = p1.waitFor();
        return returnVal == 0;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return false;
}