@java.lang.SuppressWarnings(value = "UnusedDeclaration")
public void hideToolbar() {
    if (!(prefs.getBoolean(Settings.HIDABLE_TOOLBAR, true)))
        return ;
    
    if ((Build.VERSION.SDK_INT) >= 14)
        toolbar.animate().y((-(toolbar.getHeight()))).setDuration(anabolicandroids.chanobol.ui.MainActivity.dur);
    else
        anabolicandroids.chanobol.util.Util.animateY(toolbar, 0, (-(toolbar.getHeight())), anabolicandroids.chanobol.ui.MainActivity.dur);
    
}