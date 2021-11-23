public final void setServerName(final java.lang.String serverName) {
    if (serverName != null) {
        if (serverName.endsWith("/")) {
            this.serverName = serverName.substring(0, ((serverName.length()) - 1));
            logger.info("Eliminated extra slash from serverName [{}].  It is now [{}]", serverName, this.serverName);
        }else {
            this.serverName = serverName;
        }
    }
}