public void initThread(net.ddns.akd.wincleaner.view.MainMenuController controller) {
    if ((thread) == null) {
        java.lang.System.out.println("Thread wird gestartet..");
        this.thread = new java.lang.Thread(new net.ddns.akd.wincleaner.network.FinderThread(controller));
    }else {
        this.thread.interrupt();
        this.thread = new java.lang.Thread(new net.ddns.akd.wincleaner.network.FinderThread(controller));
    }
}