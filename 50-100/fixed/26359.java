@java.lang.Override
public android.support.v4.app.Fragment getItem(int index) {
    switch (index) {
        case 0 :
            return new mclab1.pages.NewsFragment();
        case 1 :
            return new mclab1.pages.GoogleMapFragment();
        case 2 :
            return new mclab1.pages.OwnerFragment();
        case 3 :
            return new mclab1.pages.MediaPlayerFragment();
    }
    return null;
}