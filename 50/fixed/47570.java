@java.lang.Override
public void setContentView(@android.support.annotation.LayoutRes
int layoutResID) {
    super.setContentView(layoutResID);
    butterknife.ButterKnife.bind(this);
    setupNavDrawer();
    setupToolbar();
}