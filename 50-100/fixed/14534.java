public void buyShare(java.lang.String cmpId, double price, java.util.Date date) {
    int n = ((int) ((currentCapital) / (price * 100)));
    java.lang.System.out.println(("Buy " + cmpId));
    if (!(activeShares.containsKey(cmpId))) {
        if (n > 0) {
            Share share = new Share(cmpId, n, price, date);
            activeShares.put(cmpId, share);
            currentCapital -= n * price;
        }
    }
}