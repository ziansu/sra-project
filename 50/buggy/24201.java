@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((manager) != null)
        manager.onResume();
    
}