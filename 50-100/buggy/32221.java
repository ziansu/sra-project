private void enableAll() {
    boolean any = false;
    for (java.lang.String tab : sandbox_client.Client.TAB_NAMES) {
        if (_enabled.get(tab)) {
        }else {
            any = true;
            _enabled.put(tab, true);
            _main.broadcast(Protocol.ENABLE, tab);
            server.Main.writeColortext((tab + " tab enabled"), Main.SERVEROUT);
        }
    }
    if (!any) {
        server.Main.writeColortext("all tabs already enabled", Main.ERROR);
    }
}