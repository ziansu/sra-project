public void seedAndPersist(org.nodel.core.ArgInstance instance, org.nodel.Handler.H1<org.nodel.core.ArgInstance> persister) {
    if (instance == null)
        instance = ArgInstance.NULL;
    
    _persister = persister;
    _persistedArg = instance;
    if (instance != (ArgInstance.NULL)) {
        _argInstance.set(instance);
    }
    _persisterTimer = org.nodel.core.NodelClientEvent.s_timers.schedule(org.nodel.threading.ThreadPool.background(), new org.nodel.threading.TimerTask() {
        @java.lang.Override
        public void run() {
            handlePersistRequest();
        }
    }, PERSIST_PERIOD);
}