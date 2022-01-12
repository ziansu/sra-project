@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    android.view.Window w = getWindow();
    int resID = getResources().getIdentifier("splash", "drawable", getPackageName());
    if (resID != 0)
        w.setBackgroundDrawableResource(resID);
    
    if (!(setTranslucentStatusBar(true)))
        setLayoutNoLimit(true);
    
    super.onCreate(savedInstanceState);
    checkIntent(getIntent());
}