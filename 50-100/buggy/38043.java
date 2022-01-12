public void reset() {
    this.gameScreen.reset();
    this.playerScreen.reset();
    this.winScreen.reset();
    this.wrapper.removeAll();
    this.setVisible(false);
    this.listenerList = new javax.swing.event.EventListenerList();
    this.fireActionPerformed(new java.awt.event.ActionEvent(this, java.awt.event.ActionEvent.ACTION_PERFORMED, "Change"));
}