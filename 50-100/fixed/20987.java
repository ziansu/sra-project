private void disableAll() {
    boolean none = true;
    for (java.lang.String tab : sandbox_client.Client.TAB_NAMES) {
        if (_enabled.get(tab)) {
            none = false;
            _enabled.put(tab, false);
            _main.broadcast(Protocol.DISABLE, (tab + "\n"));
            server.Main.writeColortext((tab + " tab disabled"), Main.SERVEROUT);
        }
    }
    if (none) {
        server.Main.writeColortext("all tabs already disabled", Main.ERROR);
    }
}