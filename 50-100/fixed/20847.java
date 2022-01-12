void select(boolean animate) {
    isActive = true;
    if (animate) {
        setTopPaddingAnimated(iconView.getPaddingTop(), sixDps);
        animateIcon(activeAlpha);
        animateTitle(com.roughike.bottombar.BottomBarTab.ACTIVE_TITLE_SCALE, activeAlpha);
        animateColors(inActiveColor, activeColor);
    }else {
        setTitleScale(com.roughike.bottombar.BottomBarTab.ACTIVE_TITLE_SCALE);
        setTopPadding(sixDps);
        setColors(activeColor);
        setAlphas(activeAlpha);
    }
    if (((badge) != null) && (hideBadgeWhenSelected)) {
        badge.hide();
    }
}