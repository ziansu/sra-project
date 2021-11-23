@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (doublemoveButton.isSelected()) {
        taxiButton.setSelected(false);
        busButton.setSelected(false);
        undergroundButton.setSelected(false);
        secretButton.setSelected(false);
        firstMove = true;
        mainMap();
    }else {
        taxiButton.setSelected(false);
        busButton.setSelected(false);
        undergroundButton.setSelected(false);
        secretButton.setSelected(false);
        presenter.doubleMoveFalse();
    }
}