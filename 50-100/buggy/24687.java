public void startGame() {
    if ((levelList.getSelectedIndex()) != (-1)) {
        this.thread = new net.ccmob.apps.jpushy.core.LevelThread(this, levels.get(levelList.getSelectedIndex()));
        java.lang.Thread t = new java.lang.Thread(thread);
        t.start();
    }
}