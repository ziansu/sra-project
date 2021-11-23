public void changeTab2(org.primefaces.event.TabChangeEvent tabChangeEvent) {
    switch (tabChangeEvent.getTab().getTitle()) {
        case "Existing Holder" :
            getTabViewData().setTabIndex2(0);
            getTabViewData().setHolderProfileExist(true);
            break;
        case "New Holder" :
            getTabViewData().setTabIndex2(1);
            getTabViewData().setHolderProfileExist(false);
            break;
    }
}