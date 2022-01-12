public void onSectionAttached(int number) {
    switch (number) {
        case 1 :
            mTitle = getString(R.string.title_activity_google);
            break;
        case 2 :
            android.content.Intent home = new android.content.Intent(this, com.example.navigationdrawer.Rapports.class);
            startActivity(home);
            break;
        case 3 :
            android.content.Intent profile = new android.content.Intent(this, com.example.navigationdrawer.Accueil.class);
            startActivity(profile);
            break;
    }
}