@java.lang.Override
protected long getItemId(com.apwglobal.nice.domain.Auction auction) {
    this.startingPoint += 1000;
    return startingPoint;
}