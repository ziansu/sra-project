@java.lang.Override
public void bindData(com.taobao.weex.ui.component.WXComponent component) {
    super.bindData(component);
    mViewPager.setCurrentItem(((mAdapter.getRealCount()) * 50), true);
}