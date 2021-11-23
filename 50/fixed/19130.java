@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent event) {
    PanMain.panClick.setVisible(false);
    PanMain.panStats.setVisible(true);
    FraMain.panMain.add(PanMain.panStats, java.awt.BorderLayout.CENTER);
}