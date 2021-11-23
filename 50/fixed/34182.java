@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home_page);
    setUpWidgetsOnHomePage();
    longLatGrabber = new android.location.Geocoder(this);
    watchForLocationTextToChange();
    handlelocationButtonClick();
    handleSearchButtonPressed();
}