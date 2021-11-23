@java.lang.Override
protected void onPause() {
    if (!(isOwn))
        saveContact();
    
    super.onPause();
}