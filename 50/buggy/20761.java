@java.lang.Override
protected void onPause() {
    super.onPause();
    boolean isChangingConfigurations;
    if ((Build.VERSION.SDK_INT) > (Build.VERSION_CODES.HONEYCOMB))
        isChangingConfigurations = !(isChangingConfigurations());
    else
        isChangingConfigurations = false;
    
    if (!isChangingConfigurations)
        com.rpfsoftwares.rollapass.MainActivity.askPass = true;
    
}