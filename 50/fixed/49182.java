@java.lang.Override
protected void onPause() {
    super.onPause();
    if (isOwn)
        return ;
    
    saveContact();
}