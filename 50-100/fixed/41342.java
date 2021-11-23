private void sellShares(int numberOfShares) throws net.cs50.finance.models.StockLookupException {
    this.symbol = symbol.toUpperCase();
    if (numberOfShares > (sharesOwned)) {
        throw new java.lang.IllegalArgumentException(("Number to sell exceeds shares owned for stock" + (symbol)));
    }
    setSharesOwned(((sharesOwned) - numberOfShares));
    net.cs50.finance.models.StockTransaction transaction = new net.cs50.finance.models.StockTransaction(this, numberOfShares, StockTransaction.TransactionType.SELL);
    this.transactions.add(transaction);
}