public void loadThemedBackground() {
    int attrId;
    if (mThemeManager.isTransparentTowerInfoEnabled()) {
        attrId = R.attr.backgroundBorderTransparent;
    }else {
        attrId = R.attr.backgroundBorder;
    }
    getView().setBackgroundResource(mThemeManager.getResourceId(attrId));
    int p = ((int) (getResources().getDimension(R.dimen.fragment_tower_info_padding)));
    getView().setPadding(p, p, p, p);
}