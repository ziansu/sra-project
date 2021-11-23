public void actionPerformed(java.awt.event.ActionEvent e) {
    btnShare.setVisible(false);
    btnInfo.setVisible(false);
    java.lang.System.out.println(ownedCarList.getSelectedValue().getLicensePlate());
    java.lang.String pos = ownedCarList.getSelectedValue().getPosition();
    ownedCarList.setEnabled(false);
    gui.BrowserMap b = new gui.BrowserMap();
    b.HTML(pos);
}