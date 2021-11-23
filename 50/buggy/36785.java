public void showPopup() {
    if (!(layoutWindow.getChildren().contains(qrcode))) {
        layoutWindow.getChildren().add(qrcode);
    }
    setIdentity();
    qrcode.setVisible(true);
}