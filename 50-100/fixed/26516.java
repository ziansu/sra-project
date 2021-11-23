@java.lang.Override
public void addNotify() {
    super.addNotify();
    if ((init) == false) {
        this.addKeyListener(new bobby.main.KeyHandler());
        gsm = new bobby.state.GameStateManager();
        gsmThread = new java.lang.Thread(gsm);
        gsmThread.start();
        renderThread = new java.lang.Thread(this);
        renderThread.start();
        init = true;
    }
}