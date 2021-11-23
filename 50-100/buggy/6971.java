public static void main(java.lang.String[] args) {
    xaurora.ChromeServer chromeSvr = new xaurora.ChromeServer(6789);
    xaurora.WordServer wordSvr = new xaurora.WordServer(23333);
    java.lang.Thread chromeSvrThread = new java.lang.Thread(chromeSvr);
    java.lang.Thread wordSvrThread = new java.lang.Thread(wordSvr);
    chromeSvrThread.start();
    wordSvrThread.start();
    xaurora.ui.LoginUI.main();
}