public void swapToPreferenceFragment() {
    availableSeats = com.navi.team.emptyseatnavigator.businessobject.DBController.getController().getAvailableSeatsInt();
    fm = getFragmentManager();
    ft = fm.beginTransaction();
    com.navi.team.emptyseatnavigator.activities.PreferenceFragment preferenceFragment = new com.navi.team.emptyseatnavigator.activities.PreferenceFragment();
    android.os.Bundle prefBundle = new android.os.Bundle();
    prefBundle.putSerializable("availableSeats", availableSeats);
    preferenceFragment.setArguments(prefBundle);
    ft.replace(R.id.fragment_container, preferenceFragment, "preferenceFragment");
    ft.addToBackStack("Completed Reservation.");
    ft.commit();
}