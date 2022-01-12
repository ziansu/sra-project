@java.lang.Override
public android.app.Fragment getItem(int position) {
    android.app.Fragment f = new android.app.Fragment();
    switch (position) {
        case 0 :
            f = com.jahirfiquitiva.paperboard.fragments.IconsFragment.newInstance(R.array.latest);
            break;
        case 1 :
            f = com.jahirfiquitiva.paperboard.fragments.IconsFragment.newInstance(R.array.icon_pack_names);
            break;
        case 2 :
            f = com.jahirfiquitiva.paperboard.fragments.IconsFragment.newInstance(R.array.google);
            break;
        case 3 :
            f = com.jahirfiquitiva.paperboard.fragments.IconsFragment.newInstance(R.array.games);
            break;
    }
    return f;
}