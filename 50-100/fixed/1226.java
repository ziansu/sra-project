@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new com.example.victor.lfm.HomeTab(context);
        case 1 :
            return new com.example.victor.lfm.Tab2();
        case 2 :
            return new com.example.victor.lfm.CreateTab(context);
        default :
            break;
    }
    return null;
}