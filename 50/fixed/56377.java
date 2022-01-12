@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new com.guanyf.appmanager.Tab1();
        case 2 :
            return new com.guanyf.appmanager.Tab2();
        case 1 :
            return new com.guanyf.appmanager.Tab3();
    }
    return null;
}