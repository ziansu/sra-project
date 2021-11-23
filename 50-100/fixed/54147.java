@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (((org.septa.android.app.fragments.StopSelectionListFragment.REQUEST_CODE_GECODER) == requestCode) && (resultCode == (android.app.Activity.RESULT_OK))) {
        android.location.Location addressLocation = data.getParcelableExtra(Constants.KEY_LOCATION);
        if (addressLocation != null) {
            this.addressLocation = addressLocation;
            sortByLocations(addressLocation);
        }
    }
}