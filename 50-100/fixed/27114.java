@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    android.support.v4.app.Fragment fragment = null;
    switch (position) {
        case 0 :
            fragment = new ru.ya.translate.translator.TranslatorFragment();
            break;
        case 1 :
            fragment = new ru.ya.translate.history.HistoryFragment();
            break;
        case 2 :
            fragment = new ru.ya.translate.favorites.FavoritesFragment();
            break;
    }
    return fragment;
}