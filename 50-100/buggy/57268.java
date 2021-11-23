public void updateColors() {
    com.android.contacts.common.util.MaterialColorMapUtils.MaterialPalette themeColors = com.android.incallui.InCallPresenter.getInstance().getThemeColors();
    if (((mCurrentThemeColors) != null) && (mCurrentThemeColors.equals(themeColors))) {
        return ;
    }
    mPrimaryCallCardContainer.setBackgroundColor(themeColors.mPrimaryColor);
    mCallButtonsContainer.setBackgroundColor(themeColors.mPrimaryColor);
    mCurrentThemeColors = themeColors;
}