@java.lang.Override
public final void onViewCreated(final android.view.View view, final android.os.Bundle savedInstanceState) {
    eventRegister = new com.shipdream.lib.android.mvc.view.EventRegister(this);
    eventRegister.registerEventBuses();
    final boolean restoring = savedInstanceState != null;
    if (restoring && (isStateManagedByRootDelegateFragment)) {
        ((com.shipdream.lib.android.mvc.view.MvcActivity) (getActivity())).addPendingOnViewReadyActions(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                doOnViewCreatedCallBack(view, savedInstanceState, restoring);
                isStateManagedByRootDelegateFragment = false;
            }
        });
    }else {
        doOnViewCreatedCallBack(view, savedInstanceState, restoring);
    }
}