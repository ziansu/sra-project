public java.lang.String getPrompt(co.cask.cdap.cli.CLIConnectionConfig config) {
    try {
        return ("cdap (" + (config.getURI().resolve(("/" + (config.getNamespace().getId()))))) + ")> ";
    } catch (co.cask.cdap.client.exception.DisconnectedException e) {
        return "cdap (DISCONNECTED)> ";
    }
}