public void logout() {
    try {
        this.oauth2Client.revoke();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    this.token = null;
    this.oauth2Client = null;
}