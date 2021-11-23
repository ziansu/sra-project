public void addHomeScreenFragment() {
    com.anandroid.iailapp.fragment.HomeScreen homeSc = com.anandroid.iailapp.fragment.HomeScreen.newInstance(data);
    data.putInt(FragmentKey.INDEX, 1);
    data.putString(FROM_TAG, Constants.FROM_TAG);
    getSupportFragmentManager().beginTransaction().replace(R.id.main_login_container, homeSc, "HomeScreen").addToBackStack("HomeScreen").commitAllowingStateLoss();
}