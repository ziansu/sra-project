public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JComboBox<java.lang.String> cb = (JComboBox) < (e.getSource());
    symbol = ((java.lang.String) (cb.getSelectedItem()));
    this.setTitle(("Tick Data: " + (symbol)));
    queue.clear();
}