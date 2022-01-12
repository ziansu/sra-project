public void dispose() {
    debug.Debugger.out("Killing Player...");
    gPanel.killPlayer();
    super.dispose();
}