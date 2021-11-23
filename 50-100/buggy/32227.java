private void setExchangeRateChain(java.util.List<javax.money.convert.ExchangeRate> chain) {
    this.chain.clear();
    if ((chain == null) || (chain.isEmpty())) {
        this.chain.add(this);
    }else {
        for (javax.money.convert.ExchangeRate aChain : chain) {
            if (chain == null) {
                throw new java.lang.IllegalArgumentException("Chain element can not be null.");
            }
        }
        this.chain.addAll(chain);
    }
}