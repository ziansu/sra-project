@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return ahmadadam96.comicbookmovies.MainFragment.newInstance("All");
        case 1 :
            return ahmadadam96.comicbookmovies.MainFragment.newInstance("MCU");
        case 2 :
            return ahmadadam96.comicbookmovies.MainFragment.newInstance("DC");
        default :
            return null;
    }
}