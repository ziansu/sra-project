public void loadList() {
    loadingBotList = ListLoader.sources.size();
    for (int x = 0; x < (ListLoader.sources.size()); x++) {
        final int K = x;
        java.lang.Runnable run = new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                try {
                    it.giara.source.SourceChan chan = ListLoader.sources.get(K);
                    new it.giara.http.HTTPFileSources(chan, getInstance());
                } finally {
                    (loadingBotList)--;
                }
            }
        };
        it.giara.utils.ThreadManager.submitCacheTask(run);
    }
}