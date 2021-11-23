private java.lang.String getAuctionValue() {
    return new java.lang.StringBuilder("Value: ").append(df.format(rankings.getDraft().getDraftValue())).toString();
}