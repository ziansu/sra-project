public void nieuweInput() {
    lstInput.getSelectionModel().select(0);
    btnOutput.setVisible(true);
    btnNieuweInput.setVisible(false);
    lstInput.setVisible(false);
    txaInput.setVisible(true);
    txaInput.setText("");
    txaOutput.setText("");
    foutieveInput = new java.util.HashSet<>();
    btnVoegFoutieveGerechtenToe.setVisible(false);
    btnPasProductAan.setVisible(false);
    btnVoegFoutieveGerechtToe.setVisible(false);
}