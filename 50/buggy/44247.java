@java.lang.Override
protected void onResume() {
    super.onResume();
    com.comli.dawnbreaksthrough.personalintro.LayoutUtils.setupDrawerItemListener(this);
    com.comli.dawnbreaksthrough.personalintro.LayoutUtils.setDrawerBehavior(LayoutUtils.PURPLE, LayoutUtils.PREFS);
    com.comli.dawnbreaksthrough.personalintro.LayoutUtils.setRippleColor(LayoutUtils.PURPLE, LayoutUtils.PREFS, this);
    mDrawer.setSelection(LayoutUtils.IDENTIFIER_PREFS, false);
}