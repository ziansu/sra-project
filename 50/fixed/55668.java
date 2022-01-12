public void setCsmServerName(java.lang.String serverName) {
    if ((serverName != null) && (!(serverName.isEmpty()))) {
        addOption(1, serverName.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}