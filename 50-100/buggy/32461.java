@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.logout_button :
            logout();
            break;
        case R.id.aboutus_button :
            aboutUs();
            break;
        case R.id.profile_button :
            profile();
            break;
        case R.id.settings_button :
            settings();
            break;
        case R.id.help_button :
            help();
            break;
        case R.id.backbutton :
            toHomepage();
            break;
    }
}