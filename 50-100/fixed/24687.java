public void startGame() {
    if ((this.levelList.getSelectedIndex()) != (-1)) {
        this.thread = new net.ccmob.apps.jpushy.core.LevelThread(this, this.levels.get(this.levelList.getSelectedIndex()));
        java.lang.Thread t = new java.lang.Thread(this.thread);
        t.start();
    }
}