@java.lang.Override
public void run() {
    this.requestFocus();
    while (game.isRunning()) {
        render();
    } 
}