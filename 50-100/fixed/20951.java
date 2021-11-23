public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.newGameBtn :
            showNewGameDialog();
            break;
        case R.id.openGameBtn :
            openingGameDialog();
            break;
        case R.id.settingsBtn :
            startActivity(new android.content.Intent(this, qwikstats.qwikcut.kerbysoft.com.qwikstats.SettingsActivity.class));
    }
}