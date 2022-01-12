@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    switch (position) {
        case 0 :
            cw.kop.autobackground.settings.AppSettings.setTheme(R.style.AppLightTheme);
            break;
        case 1 :
            cw.kop.autobackground.settings.AppSettings.setTheme(R.style.AppDarkTheme);
            break;
        default :
    }
    setThemePrefSummary();
    restartActivity();
    dismissDialog();
}