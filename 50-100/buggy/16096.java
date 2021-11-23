public void logout() {
    boolean success;
    try {
        success = ftpClient.logout();
        if (!success) {
            java.lang.System.out.println("Could not logout of the server.");
        }else {
            java.lang.System.out.printf("Logged out successfully");
        }
    } catch (java.io.IOException e) {
        java.lang.System.err.println(e.getMessage());
    }
}