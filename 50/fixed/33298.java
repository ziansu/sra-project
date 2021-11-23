public java.lang.String getLatestVersionLastUpdate() {
    if (this.latestVersionLastUpdate.equals("N/A")) {
        getLatestVersion();
    }
    return this.latestVersionLastUpdate;
}