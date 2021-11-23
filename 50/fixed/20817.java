@java.lang.Override
public void setTitle(java.lang.CharSequence title, java.lang.CharSequence subtitle) {
    android.support.v7.app.ActionBar bar = getSupportActionBar();
    if (title != null)
        bar.setTitle(title);
    
    if (subtitle != null)
        bar.setSubtitle(subtitle);
    
}