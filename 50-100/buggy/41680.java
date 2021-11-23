public void setFooterView(in.srain.cube.views.ptr.View footer) {
    if ((((mFooterView) != null) && (footer != null)) && ((mHeaderView) != footer)) {
        removeView(mHeaderView);
    }
    in.srain.cube.views.ptr.ViewGroup.LayoutParams lp = footer.getLayoutParams();
    if (lp == null) {
        lp = new in.srain.cube.views.ptr.PtrFrameLayout.LayoutParams((-1), (-2));
        footer.setLayoutParams(lp);
    }
    mFooterView = footer;
    addView(footer);
}