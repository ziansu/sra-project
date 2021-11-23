public void makeFooterStatic() {
    com.lorepo.icplayer.client.PlayerApp.removeStaticFooter();
    if ((com.lorepo.icplayer.client.PlayerApp.getScreenHeight()) < (com.lorepo.icplayer.client.PlayerApp.getPageHeight())) {
        int headerHeight = com.lorepo.icplayer.client.PlayerApp.getHeaderHeight();
        com.lorepo.icplayer.client.PlayerApp.setStaticFooter(headerHeight, isStaticHeader);
    }
}