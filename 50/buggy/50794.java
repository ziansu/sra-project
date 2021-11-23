@java.lang.Override
protected void onStart() {
    super.onStart();
    if (!(isMarshmallowOrEarlier()))
        initialize();
    
}