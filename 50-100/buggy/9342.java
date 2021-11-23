public double getDropRate() {
    java.lang.System.out.print(("The size of bids is :" + (bids.size())));
    double prev = utilSpace.getUtility(bids.get(0));
    double average = 0;
    for (int i = 1; i < (bids.size()); i++) {
        double curr = utilSpace.getUtility(bids.get(i));
        average += curr - prev;
        prev = curr;
    }
    return average / (bids.size());
}