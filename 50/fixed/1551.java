@java.lang.Override
public void show(long time, boolean animate) {
    super.show(time, animate);
    resetLayout();
    createBaseLayoutTab(mBaseTab);
}