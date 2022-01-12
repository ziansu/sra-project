private void setToolbarTitle() {
    android.support.v7.app.ActionBar bar = getSupportActionBar();
    if (currentModeIs(ViewMode.ADD_MODE)) {
        android.util.Log.e("ADD MODE SET", "Title for add mode set");
        bar.setTitle("Add Books");
    }else
        if (currentModeIs(ViewMode.EDIT_MODE)) {
            bar.setTitle("Edit");
        }else {
            bar.setTitle("My Books");
            android.util.Log.e("Default title set", "Default title");
        }
    
}