public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.menu_oprogramu :
            alertView(programInfo());
            break;
        case R.id.menu_basedby :
            openWebPage(cz.kerslager.android.mzda.MainActivity.URL_PODLE);
            break;
        case R.id.menu_source :
            openWebPage(cz.kerslager.android.mzda.MainActivity.URL_ZDROJ);
            break;
        case R.id.menu_chyby :
            openWebPage(cz.kerslager.android.mzda.MainActivity.URL_CHYBY);
        case R.id.menu_spsse :
            openWebPage(cz.kerslager.android.mzda.MainActivity.URL_SPSSE);
            break;
        case R.id.menu_ukoncit :
            finish();
            break;
    }
    return super.onOptionsItemSelected(item);
}