public int getNumberOfGood(java.lang.String good) {
    if ((this.goods.get(good)) == null) {
        return 0;
    }
    return this.goods.get(good);
}