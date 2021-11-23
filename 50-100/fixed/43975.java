private void setToolbarTitle() {
    android.support.v7.app.ActionBar bar = getSupportActionBar();
    if (currentModeIs(ViewMode.ADD_MODE)) {
        bar.setTitle("Add Books");
    }else
        if (currentModeIs(ViewMode.EDIT_MODE)) {
            bar.setTitle("Edit");
        }else {
            bar.setTitle("My Books");
        }
    
}