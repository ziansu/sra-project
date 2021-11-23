@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    busButton.setSelected(false);
    undergroundButton.setSelected(false);
    secretButton.setSelected(false);
    if (taxiButton.isSelected()) {
        taxiMap();
    }else {
        mainMap();
    }
}