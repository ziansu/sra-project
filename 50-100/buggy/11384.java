public void setScreen(View.YatzyScreen screen) {
    this.wrapper.removeAll();
    this.wrapper.add(screen, java.awt.BorderLayout.CENTER);
    this.fireActionPerformed(new java.awt.event.ActionEvent(this, java.awt.event.ActionEvent.ACTION_PERFORMED, "Change"));
    this.setLocationRelativeTo(null);
    this.setVisible(true);
}