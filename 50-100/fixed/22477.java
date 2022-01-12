@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    if ((newConfig.orientation) == (android.content.res.Configuration.ORIENTATION_LANDSCAPE)) {
        setContentView(R.layout.activity_see_character);
        fillHorizontalValues();
    }else
        if ((newConfig.orientation) == (android.content.res.Configuration.ORIENTATION_PORTRAIT)) {
            setContentView(R.layout.activity_see_character);
            fillVerticalValues();
        }
    
}