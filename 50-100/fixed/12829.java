public void chooseRightFragment() {
    avia.androi.innopolis.com.aviasales.models.User user = avia.androi.innopolis.com.aviasales.utils.ShPrefUtils.getUser();
    user = null;
    if (user == null) {
        android.app.Fragment fragment = avia.androi.innopolis.com.aviasales.login.LoginFragment.newInstance();
        iView.showFragment(fragment);
    }else {
        android.app.Fragment fragment = avia.androi.innopolis.com.aviasales.search.TicketFragment.newInstance();
        iView.showFragment(fragment);
        iView.initializeNavDrawer();
    }
}