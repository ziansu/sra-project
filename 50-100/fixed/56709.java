@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
        case 2 :
            return com.example.testapp1.MainActivity.PlaceholderFragment.newInstance((position + 1));
        case 1 :
            return com.example.testapp1.MainActivity.CameraPictureFragment.newInstance((position + 1));
        default :
            return null;
    }
}