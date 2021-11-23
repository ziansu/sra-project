@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JComboBox cb = ((javax.swing.JComboBox) (e.getSource()));
    symbol = ((java.lang.String) (cb.getSelectedItem()));
    this.setTitle(("Tick Data: " + (symbol)));
    queue.clear();
}