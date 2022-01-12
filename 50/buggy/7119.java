@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new capstoneproject.androidnanodegree.com.cochelper.fragments.VideoFragment();
        case 1 :
            return new capstoneproject.androidnanodegree.com.cochelper.fragments.FileFragment();
        default :
            return null;
    }
}