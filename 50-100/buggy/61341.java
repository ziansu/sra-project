public void setInfo(com.android.systemui.statusbar.phone.NavbarEditor.ButtonInfo item, boolean isVertical, boolean isSmall) {
    final android.content.res.Resources res = getResources();
    final int keyDrawableResId;
    setTag(item);
    setContentDescription(res.getString(item.contentDescription));
    mCode = item.keyCode;
    mIsSmall = isSmall;
    if (isSmall) {
        keyDrawableResId = item.sideResource;
    }else
        if (!isVertical) {
            keyDrawableResId = item.portResource;
        }else {
            keyDrawableResId = item.landResource;
        }
    
    setImageDrawable(res.getDrawable(keyDrawableResId));
    updateVisibility();
}