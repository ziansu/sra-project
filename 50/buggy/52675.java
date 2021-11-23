public void createProduct() {
    product.setAuctionUser(auctionUserView.getAuctionUser());
    java.lang.System.out.println(auctionUserView.getAuctionUser().getProducts().size());
    productFacade.create(product);
    auctionUserView.update();
}