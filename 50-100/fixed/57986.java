protected T_Presenter resolvePresenter() {
    T_Presenter presenter = getPresenter();
    if (presenter == null) {
        if (com.robopupu.api.plugin.PluginBus.isPlugin(getClass())) {
            com.robopupu.api.plugin.PluginBus.plug(this);
            presenter = getPresenter();
        }
    }
    return presenter;
}