@java.lang.Override
public <T extends com.swarmnyc.mvvmlib.MvvmViewModel> void dismiss(final java.lang.Class<T> viewModelClass) {
    android.content.Context context = mvvmContext.getAndroidContext();
    com.swarmnyc.mvvmlib.navigation.NavigationHandler navigationHandler = maps.get(viewModelClass);
    if (navigationHandler instanceof com.swarmnyc.mvvmlib.navigation.DialogFragmentNavigationHandler) {
        ((com.swarmnyc.mvvmlib.navigation.DialogFragmentNavigationHandler) (navigationHandler)).dismiss(context);
    }
    if (navigationHandler instanceof com.swarmnyc.mvvmlib.navigation.DialogFragmentNavigationHandler) {
        ((com.swarmnyc.mvvmlib.navigation.DialogFragmentNavigationHandler) (navigationHandler)).dismiss(context, null);
    }
}