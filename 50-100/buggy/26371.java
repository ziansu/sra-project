private void saveSelectedSites() {
    selectedSites.clear();
    if ((selectByActor) != null) {
        for (gov.nist.toolkit.xdstools2.client.tabs.genericQueryTab.RadioButton b : byActorButtons) {
            if (b.getValue()) {
                selectedSites.add(b.getText());
            }
        }
    }else {
        gov.nist.toolkit.sitemanagement.client.SiteSpec site = transactionSelectionManager.generateSiteSpec();
        if (site != null) {
            selectedSites.add(site.getName());
        }
    }
}