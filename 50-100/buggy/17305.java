@java.lang.Override
public void onKeyRelease(java.awt.event.KeyEvent event) {
    if ((event.getKeyCode()) == (java.awt.event.KeyEvent.VK_ESCAPE)) {
        AnagarMainWindow.INSTANCE.setCurrentStateGUI(new me.kenzierocks.anagar.state.PauseScreen(this));
        return ;
    }
    if ((this.keypresses) > (this.kpRequired)) {
        return ;
    }
    (this.keypresses)++;
    this.bar.setValue(this.keypresses);
    if ((this.keypresses) > (this.kpRequired)) {
        finishHacking();
    }
}