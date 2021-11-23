public static java.lang.String getCurrentUser() {
    java.lang.String user = java.lang.System.getenv("USER");
    if (user == null) {
        try {
            user = org.apache.hadoop.util.Shell.execCommand("whoami").trim();
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
    return user;
}