@java.lang.Override
public void onLocationAvailable(java.lang.String postalCode) {
    mSearchFilter.setPostalCode(postalCode);
    android.support.design.widget.Snackbar.make(findViewById(android.R.id.content), ("Location found: " + postalCode), Snackbar.LENGTH_LONG).show();
}