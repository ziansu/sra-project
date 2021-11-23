public void showPopUp(com.mobideck.appdeck.AppDeckFragment origin, java.lang.String absoluteURL) {
    com.mobideck.appdeck.AppDeckFragment fragment = initPageFragment(absoluteURL, true, false);
    pushFragment(fragment);
}