public void makeFooterStatic() {
    if ((com.lorepo.icplayer.client.PlayerApp.getScreenHeight()) < (com.lorepo.icplayer.client.PlayerApp.getPageHeight())) {
        int headerHeight = com.lorepo.icplayer.client.PlayerApp.getHeaderHeight();
        com.lorepo.icplayer.client.PlayerApp.setStaticFooter(headerHeight, isStaticHeader);
    }else {
        com.lorepo.icplayer.client.PlayerApp.removeStaticFooter();
    }
}