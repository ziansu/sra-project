private android.support.v4.app.Fragment getHomeFragment() {
    switch (com.reader.quranreader.MainActivity.navItemIndex) {
        case 0 :
            return com.reader.quranreader.HomeFragment.newInstance(2);
        case 1 :
            com.reader.quranreader.ShuffleFragment shuffleFragment = new com.reader.quranreader.ShuffleFragment();
            return shuffleFragment;
        case 3 :
            com.reader.quranreader.SettingsFragment settingsFragment = new com.reader.quranreader.SettingsFragment();
            return settingsFragment;
        default :
            return new com.reader.quranreader.HomeFragment();
    }
}