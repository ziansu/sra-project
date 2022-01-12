public void setBehaviorTranslationEnabled(boolean behaviorTranslationEnabled) {
    this.behaviorTranslationEnabled = behaviorTranslationEnabled;
    if ((getParent()) instanceof android.support.design.widget.CoordinatorLayout) {
        android.view.ViewGroup.LayoutParams params = getLayoutParams();
        if ((bottomNavigationBehavior) == null) {
            bottomNavigationBehavior = new com.aurelhubert.ahbottomnavigation.AHBottomNavigationBehavior(behaviorTranslationEnabled);
        }else {
            bottomNavigationBehavior.setBehaviorTranslationEnabled(behaviorTranslationEnabled);
        }
        ((android.support.design.widget.CoordinatorLayout.LayoutParams) (params)).setBehavior(bottomNavigationBehavior);
        if (needHideBottomNavigation) {
            needHideBottomNavigation = false;
            bottomNavigationBehavior.hideView(this, bottomNavigationHeight, hideBottomNavigationWithAnimation);
        }
    }
}