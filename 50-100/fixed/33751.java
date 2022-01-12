@java.lang.Override
@org.springframework.scheduling.annotation.Scheduled(fixedDelay = com.oakinvest.b2g.batch.bitcoin.BitcoinBatchCache.PAUSE_BETWEEN_IMPORTS)
@java.lang.SuppressWarnings(value = { "checkstyle:designforextension" , "checkstyle:emptyforiteratorpad" })
public void process() {
    final long currentBlockBeingImported = getBlockRepository().count();
    for (long i = 0; i < (com.oakinvest.b2g.batch.bitcoin.BitcoinBatchCache.NUMBER_OF_BLOCKS_TO_CACHE); i++) {
        try {
            getBlockDataFromBitcoind((currentBlockBeingImported + i));
        } catch (java.lang.Exception e) {
            getLogger().error(("Error while loading cache " + (e.getMessage())));
        }
    }
}