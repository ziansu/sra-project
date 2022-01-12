@java.lang.Override
public void onModuleCreate(android.content.Context context, android.os.Bundle savedInstanceState) {
    super.onModuleCreate(context, savedInstanceState);
    if (!(context instanceof android.support.v7.app.ActionBarActivity)) {
        throw new java.lang.IllegalStateException("NavigationDrawer module must be used just on ActionBarActivity");
    }
    onLoadContentDrawerView(context, savedInstanceState);
    onLoadContentDrawerFragment(context, savedInstanceState);
    if ((mCallbacks) != null)
        mCallbacks.onNavigationDrawerLoaded(this);
    
}