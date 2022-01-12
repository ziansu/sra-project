@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            com.example.victor.lfm.HomeTab home = new com.example.victor.lfm.HomeTab(context);
            return home;
        case 1 :
            com.example.victor.lfm.Tab2 tab2 = new com.example.victor.lfm.Tab2();
            return tab2;
        case 2 :
            com.example.victor.lfm.CreateTab createTab = new com.example.victor.lfm.CreateTab(context, mGoogleApiClient);
            return createTab;
        default :
            break;
    }
    return null;
}