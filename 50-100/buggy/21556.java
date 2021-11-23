private void checkForInvoice() {
    if ((gui.SellingMain.saleClosed) == true) {
        gui.SellingMain.invoice = gui.SellingMain.tx.getInvoice();
        gui.SellingMain.saleClosed = false;
        invoiceLbl.setText(java.lang.String.valueOf(gui.SellingMain.invoice));
        gui.SellingMain.addTextLog("\n===================");
        gui.SellingMain.addTextLog(("\nInvoice number: " + (gui.SellingMain.invoice)));
        gui.SellingMain.addTextLog("\n===================");
    }
}