protected T_Presenter resolvePresenter() {
    T_Presenter presenter = getPresenter();
    if (presenter == null) {
        if (com.robopupu.api.plugin.PluginBus.isPlugin(getClass())) {
            android.util.Log.d(com.robopupu.api.mvp.ViewFragment.TAG, "resolvePresenter() : Needs to plug the View to PluginBus");
            com.robopupu.api.plugin.PluginBus.plug(this);
            presenter = getPresenter();
            android.util.Log.d(com.robopupu.api.mvp.ViewFragment.TAG, ("resolvePresenter() : Presenter: " + presenter));
        }
    }
    return presenter;
}