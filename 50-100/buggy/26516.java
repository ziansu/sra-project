@java.lang.Override
public void addNotify() {
    super.addNotify();
    if ((renderThread) == null) {
        this.addKeyListener(new bobby.main.KeyHandler());
        renderThread = new java.lang.Thread(this);
        renderThread.start();
    }
    if ((gsmThread) == null) {
        gsm = new bobby.state.GameStateManager();
        gsmThread = new java.lang.Thread(gsm);
        gsmThread.start();
    }
}