public void debugConsole(java.lang.String msg) {
    if (plugin.getConfig().getBoolean("debug", false)) {
        log(("[Debug]" + msg));
    }
}