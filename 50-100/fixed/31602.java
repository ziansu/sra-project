public void loadThemedBackground() {
    android.view.View view = getView();
    if (view != null) {
        int attrId;
        if (mThemeManager.isTransparentTowerInfoEnabled()) {
            attrId = R.attr.backgroundBorderTransparent;
        }else {
            attrId = R.attr.backgroundBorder;
        }
        view.setBackgroundResource(mThemeManager.getResourceId(attrId));
        int p = ((int) (getResources().getDimension(R.dimen.fragment_tower_info_padding)));
        getView().setPadding(p, p, p, p);
    }
}