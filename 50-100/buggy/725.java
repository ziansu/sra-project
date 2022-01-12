public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((getContentPane().getComponentCount()) > 0) {
        getContentPane().remove(panelAusgabe);
        getContentPane().remove(panelPrognose);
    }
    getContentPane().add(panelEinnahme);
    printAll(getGraphics());
}