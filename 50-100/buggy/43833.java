@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    navigator = com.zeyad.rxredux.core.navigation.NavigatorFactory.getInstance();
    rxEventBus = com.zeyad.rxredux.core.eventbus.RxEventBusFactory.getInstance();
    android.support.v7.app.AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    restoreViewStateFromBundle(savedInstanceState);
    viewModel = ((VM) (android.arch.lifecycle.ViewModelProviders.of(this).get(viewModel.<VM>getClass())));
    initialize();
    setupUI();
}