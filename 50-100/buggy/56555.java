public void actionPerformed(java.awt.event.ActionEvent evt) {
    mekhq.campaign.parts.Part p = getPartByNameAndDetails(pn);
    getCampaign().getShoppingList().addShoppingItem(p.getAcquisitionWork(), 1, getCampaign());
    refreshReport();
    refreshAcquireList();
    refreshPartsList();
    refreshFinancialTransactions();
    refreshOverview();
}