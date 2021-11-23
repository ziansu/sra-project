@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new android.support.v4.app.Fragment();
        case 1 :
            return new com.dismas.imaya.info_parks.GameReservesFragment();
    }
    return null;
}