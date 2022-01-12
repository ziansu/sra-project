private void index() {
    long max = 1503732600000L;
    do {
        long min = max - 20000;
        kon.shol.searchengine.elasticsearch.MultiThreadEsFeederFromHbase.PartialFeeder partialFeeder;
        try {
            partialFeeder = new kon.shol.searchengine.elasticsearch.MultiThreadEsFeederFromHbase.PartialFeeder(min, max, (indexerNumber = (indexerNumber) + (1 % (kon.shol.searchengine.elasticsearch.MultiThreadEsFeederFromHbase.THREAD_COUNT))));
        } catch (java.io.IOException ex) {
            kon.shol.searchengine.elasticsearch.MultiThreadEsFeederFromHbase.logger.error(ex.toString());
            continue;
        } finally {
            max = min;
        }
        executor.execute(partialFeeder);
    } while (true );
}