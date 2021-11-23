@java.lang.Override
public void endTransition(android.animation.LayoutTransition transition, android.view.ViewGroup container, android.view.View view, int transitionType) {
    if (NavbarEditor.NAVBAR_BACK.equals(view.getTag())) {
        mBackTransitioning = false;
    }else
        if ((NavbarEditor.NAVBAR_HOME.equals(view.getTag())) && (transitionType == (android.animation.LayoutTransition.APPEARING))) {
            mHomeAppearing = false;
        }
    
    onNavButtonTouched();
}