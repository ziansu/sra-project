public int getBestStore() {
    java.lang.String[] price = this.getPrice();
    java.lang.String bestPrice = this.getBestPrice();
    for (int index = 0; index < (price.length); index++) {
        if (price[index].equals(bestPrice)) {
            return index;
        }
    }
    return -1;
}