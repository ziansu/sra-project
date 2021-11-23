@java.lang.Override
public void prefChanged(java.lang.String key) {
    switch (key) {
        case ca.marklauman.dominionpicker.settings.Prefs.FILT_LANG :
        case ca.marklauman.dominionpicker.settings.Prefs.SORT_CARD :
            adapter.rebuild();
            break;
    }
}