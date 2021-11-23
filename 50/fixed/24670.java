@java.lang.Override
public void onClick(android.view.View view) {
    changeNavigationHeader(popBackStack());
    if (shouldShowLogo()) {
        setUpInitStateOfMenu();
    }
}