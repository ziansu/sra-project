public int buyStock(int amount) {
    if ((value) != 0) {
        int numShares = amount / (value);
        userOwn = numShares;
        invested += numShares * (value);
        return numShares * (value);
    }else {
        return 0;
    }
}