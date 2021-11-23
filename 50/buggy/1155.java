@java.lang.Override
protected void onMode(java.lang.String channel, java.lang.String sourceNick, java.lang.String sourceLogin, java.lang.String sourceHostname, java.lang.String mode) {
    java.lang.System.out.println(("onMode: " + sourceNick));
    super.onMode(channel, sourceNick, sourceLogin, sourceHostname, mode);
}