@java.lang.Override
public void onSessionExchangeOutcome(long exchangeId, boolean isSuccess, com.bolyartech.forge.base.exchange.ForgeExchangeResult result) {
    if (exchangeId == (mAutoRegisterXId)) {
        handleAutoRegisterOutcome(exchangeId, isSuccess, result);
    }else
        if (exchangeId == (mLoginXId)) {
            handleLoginOutcome(exchangeId, isSuccess, result);
        }
    
}