public static void main(java.lang.String[] args) {
    xaurora.system.SystemManager sa = xaurora.system.SystemManager.getInstance();
    java.lang.System.out.println(sa.isNetAccessible());
    if (sa.isNetAccessible()) {
        xaurora.ChromeServer chromeSvr = new xaurora.ChromeServer(xaurora.Main.PORT_BROWSER);
        java.lang.Thread chromeSvrThread = new java.lang.Thread(chromeSvr);
        chromeSvrThread.start();
    }
    xaurora.WordServer wordSvr = new xaurora.WordServer(xaurora.Main.PORT_PLUGIN);
    java.lang.Thread wordSvrThread = new java.lang.Thread(wordSvr);
    wordSvrThread.start();
    sa.login(false);
}