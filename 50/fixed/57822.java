public void debugConsole(java.lang.String msg) {
    if (((plugin) != null) && (plugin.getConfig().getBoolean("debug", false))) {
        log(("[Debug]" + msg));
    }
}