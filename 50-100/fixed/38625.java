public void loadList() {
    loadingBotList = ListLoader.sources.size();
    java.lang.Runnable run = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            for (int x = 0; x < (ListLoader.sources.size()); x++) {
                try {
                    it.giara.source.SourceChan chan = ListLoader.sources.get(x);
                    new it.giara.http.HTTPFileSources(chan, getInstance());
                } finally {
                    (loadingBotList)--;
                }
            }
        }
    };
    it.giara.utils.ThreadManager.submitCacheTask(run);
}