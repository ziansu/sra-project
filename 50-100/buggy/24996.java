@java.lang.Override
public void showConfiguration() {
    menuClosed();
    ch.bfh.bti7081.s2016.white.sne.ui.model.ConfigurationProvider prov = new ch.bfh.bti7081.s2016.white.sne.ui.model.ConfigurationProvider(new ch.bfh.bti7081.s2016.white.sne.data.User(ch.bfh.bti7081.s2016.white.sne.ui.presenter.SneMenuPresenter.USER));
    ch.bfh.bti7081.s2016.white.sne.ui.view.ConfigurationViewImpl view = new ch.bfh.bti7081.s2016.white.sne.ui.view.ConfigurationViewImpl();
    ch.bfh.bti7081.s2016.white.sne.ui.presenter.ConfigurationPresenter cv = new ch.bfh.bti7081.s2016.white.sne.ui.presenter.ConfigurationPresenter(prov, view);
    com.vaadin.addon.touchkit.ui.NavigationManager nm = view.getNavigationManager();
    if (nm == null) {
        nm = new com.vaadin.addon.touchkit.ui.NavigationManager();
    }
    nm.navigateTo(cv.getView());
}