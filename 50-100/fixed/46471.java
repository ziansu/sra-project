public void init(android.support.v4.app.FragmentActivity context, boolean asDialog) {
    final android.view.LayoutInflater inflater = ((android.view.LayoutInflater) (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
    inflater.inflate((asDialog ? R.layout.layout_dialog_location2 : R.layout.layout_settings_location2), this);
    myParent = context;
    initViews(context);
    loadSettings(context);
    setMode(mode);
    populateLocationList();
    isInitialized = true;
}