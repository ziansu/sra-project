@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((com.elementaryengineers.fwc.db.FWCConfigurator.getCurrentPage()) != (Page.MY_ACCOUNT)) {
        if ((myAccount) == null) {
            myAccount = new com.elementaryengineers.fwc.panel.Account();
            pnCard.add(myAccount, "Account");
        }
        cardLayout.show(pnCard, "Account");
        com.elementaryengineers.fwc.db.FWCConfigurator.setCurrentPage(Page.MY_ACCOUNT);
    }
}