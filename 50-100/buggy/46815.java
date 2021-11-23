public void actionPerformed(java.awt.event.ActionEvent e) {
    getDataEinnahme();
    ((javax.swing.JPanel) (getContentPane().getComponent(2))).removeAll();
    ((javax.swing.JPanel) (getContentPane().getComponent(2))).add(panelEinnahme);
    getContentPane().getComponent(1).revalidate();
}