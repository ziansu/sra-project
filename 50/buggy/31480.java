public void dispose() {
    debug.Debugger.out("Killing Player...");
    gPanel.sound = false;
    gPanel.killPlayer();
    super.dispose();
}