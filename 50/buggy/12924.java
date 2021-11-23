public api.web.gw2.mapping.core.CoinAmount minusGold(final long amount) {
    if (amount == 0) {
        return this;
    }
    return api.web.gw2.mapping.core.CoinAmount.ofCopper((amount * (api.web.gw2.mapping.core.CoinAmount.GOLD_VALUE)));
}