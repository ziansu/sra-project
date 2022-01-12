public utils.Pair<java.math.BigDecimal, java.lang.Integer> calcRecommendedFeeForMessage(byte[] message) {
    return this.transactionCreator.calcRecommendedFeeForMessage(message);
}