public static void unregisterServer(java.lang.String name) {
    net.md_5.bungee.api.ProxyServer.getInstance().getServers().remove(name);
    tk.mctechniclp.devathlon2.ServerManager.usedRam -= tk.mctechniclp.devathlon2.ServerManager.ramPerServer;
}