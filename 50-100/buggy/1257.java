@java.lang.Override
public void run() {
    while (com.whippy.sponge.whipconomy.cache.ConfigurationLoader.hasAuctions()) {
        com.whippy.sponge.whipconomy.orchestrator.Auctioneer auctioneer = com.whippy.sponge.whipconomy.beans.StaticsHandler.getAuctioneer();
        auctioneer.getAuctions();
        if ((auctioneer.getAuctions().size()) > 0) {
            auctioneer.setCurrentAuction(auctioneer.getAuctions().remove(0));
            auctioneer.getCurrentAuction().run();
        }
    } 
}