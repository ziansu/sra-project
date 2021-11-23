private java.lang.String getAuctionValue() {
    return new java.lang.StringBuilder("Value: ").append(df.format(rankings.getDraft().getDraftValue())).append(Constants.LINE_BREAK).append(Constants.LINE_BREAK).toString();
}