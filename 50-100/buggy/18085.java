private void checkWishes(networkMarket.marketPlace.Item item) throws java.rmi.RemoteException {
    java.util.List<java.util.List<networkMarket.marketPlace.Wish>> allWishes = new java.util.ArrayList(wishlist.values());
    for (java.util.List<networkMarket.marketPlace.Wish> l : allWishes) {
        for (networkMarket.marketPlace.Wish w : l) {
            if (((w.getPrice()) >= (item.getPrice())) && (w.getItemName().equals(w.getItemName()))) {
                w.setBeenFound(true);
            }
        }
    }
}