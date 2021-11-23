public com.teambeer.query.BeerStats merge(com.teambeer.query.BeerStats bs2) {
    this.beerMoney.add(bs2.beerMoney);
    this.totalMoney.add(bs2.totalMoney);
    return this;
}