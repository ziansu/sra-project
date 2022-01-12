public void actionPerformed(java.awt.event.ActionEvent e) {
    com.floreantpos.ui.dialog.NumberSelectionDialog2 dialog = new com.floreantpos.ui.dialog.NumberSelectionDialog2();
    dialog.setTitle("Enter number of bills");
    dialog.setValue(0);
    dialog.pack();
    dialog.open();
    if (dialog.isCanceled()) {
        return ;
    }
    int num = ((int) (dialog.getValue()));
    settleTicketView.updateSplitTicketView(num);
}