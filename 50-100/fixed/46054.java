public java.lang.String createAuction() {
    try {
        this.productFacade.create(product);
    } catch (javax.ejb.EJBException e) {
        return "new-auction";
    }
    java.util.Date startTime = new java.util.Date();
    auction.setStarttime(startTime);
    auction.setProductId(product);
    try {
        this.auctionFacade.create(auction);
    } catch (javax.ejb.EJBException e) {
        return "new-auction";
    }
    java.lang.Long id = (auction.getId()) - 1L;
    return "auction-detail?faces-redirect=true&id=" + id;
}