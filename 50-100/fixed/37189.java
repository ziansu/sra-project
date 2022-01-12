public void actionPerformed(java.awt.event.ActionEvent e) {
    if (e.getActionCommand().equals("barcode")) {
        barcodeBox.requestFocus();
        return ;
    }
    if (e.getActionCommand().equals("name")) {
        artikelBox.requestFocus();
        return ;
    }
    if (e.getActionCommand().equals("nummer")) {
        nummerBox.requestFocus();
        return ;
    }
}