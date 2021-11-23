@java.lang.Override
public void onExchangeOutcome(long exchangeId, boolean isSuccess, com.bolyartech.forge.base.exchange.forge.ForgeExchangeResult forgeExchangeResult) {
    if (forgeExchangeResult != null) {
        mLogger.debug("Forge exchange returned with code {}", forgeExchangeResult.getCode());
    }
    if (isSuccess) {
        mSession.prolong();
    }
    if ((getActiveResidentComponent()) instanceof com.bolyartech.forge.base.exchange.forge.ForgeExchangeManagerListener) {
        com.bolyartech.forge.base.exchange.forge.ForgeExchangeManagerListener l = ((com.bolyartech.forge.base.exchange.forge.ForgeExchangeManagerListener) (getActiveResidentComponent()));
        l.onExchangeOutcome(exchangeId, isSuccess, forgeExchangeResult);
    }
}