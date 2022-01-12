@java.lang.Override
public void onActivityDestroyed(android.app.Activity activity) {
    (activityCounter)--;
    if (activity instanceof com.hardsoftstudio.rxflux.dispatcher.RxViewDispatch) {
        java.util.List<com.hardsoftstudio.rxflux.store.RxStore> rxStoreList = ((com.hardsoftstudio.rxflux.dispatcher.RxViewDispatch) (activity)).getRxStoreListToUnRegister();
        if (rxStoreList != null) {
            for (com.hardsoftstudio.rxflux.store.RxStore rxStore : rxStoreList) {
                rxStore.unregister();
            }
        }
    }
    if ((activityCounter) == 0) {
        com.hardsoftstudio.rxflux.RxFlux.shutdown();
    }
}