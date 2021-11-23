@java.lang.Override
protected void onStop() {
    if (!(isMarshmallowOrEarlier()))
        cleanup();
    
    super.onStop();
}