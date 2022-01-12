public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getActionCommand()) == "barcode") {
        barcodeBox.requestFocus();
        return ;
    }
    if ((e.getActionCommand()) == "name") {
        artikelBox.requestFocus();
        return ;
    }
    if ((e.getActionCommand()) == "nummer") {
        nummerBox.requestFocus();
        return ;
    }
}