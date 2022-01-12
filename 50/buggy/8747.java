@java.lang.Override
public void onResume() {
    super.onResume();
    if ((presenter) == null)
        presenter = nucleus.manager.PresenterManager.getInstance().provide(this, null);
    
    presenter.takeView(this);
}