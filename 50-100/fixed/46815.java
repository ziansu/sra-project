public void actionPerformed(java.awt.event.ActionEvent e) {
    getDataEinnahme();
    getContentPane().getComponent(1).show(false);
    ((javax.swing.JPanel) (getContentPane().getComponent(2))).removeAll();
    ((javax.swing.JPanel) (getContentPane().getComponent(2))).add(panelEinnahme);
    getContentPane().getComponent(1).revalidate();
}