@java.lang.Override
protected void onReset() {
    super.onReset();
    if (serverSelection.isSet())
        loadHostData();
    
}