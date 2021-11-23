@javax.annotation.OverridingMethodsMustInvokeSuper
public de.metas.event.QueueableForwardingEventBus queueEventsUntilTrxCommit(final java.lang.String trxName) {
    final org.adempiere.ad.trx.api.ITrxManager trxManager = org.adempiere.util.Services.get(org.adempiere.ad.trx.api.ITrxManager.class);
    if (trxManager.isNull(trxName)) {
        flushAndStopQueuing();
        return this;
    }
    queueEvents();
    trxManager.getTrxListenerManager(trxName).registerListener(new org.adempiere.ad.trx.spi.TrxListenerAdapter() {
        @java.lang.Override
        public void afterCommit(final org.adempiere.ad.trx.api.ITrx trx) {
            flushAndStopQueuing();
        }

        @java.lang.Override
        public void afterClose(final org.adempiere.ad.trx.api.ITrx trx) {
            clearQueuedEvents();
            flushAndStopQueuing();
        }
    });
    return this;
}