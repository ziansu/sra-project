@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
    myInitialButtons.setVisible(false);
    myInitialButtons.setEnabled(false);
    if (((auctionItemList) != null) || (auctionItemList.isSelectionEmpty())) {
        confirmCancelItem();
    }
}