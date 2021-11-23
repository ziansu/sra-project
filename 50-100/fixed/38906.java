private void setMarginBottomTabContainer() {
    io.karim.MarginLayoutParams mlp = ((io.karim.MarginLayoutParams) (tabsContainer.getLayoutParams()));
    int bottomMargin = ((indicatorHeight) >= (underlineHeight)) ? indicatorHeight : underlineHeight;
    mlp.setMargins(mlp.leftMargin, mlp.topMargin, mlp.rightMargin, bottomMargin);
    tabsContainer.setLayoutParams(mlp);
}