public void setLocation(java.util.List<com.snaphy.mapstrack.Model.ContactModel> location) {
    locationShareAdapterContacts = new com.snaphy.mapstrack.Adapter.LocationShareAdapterContacts(mainActivity, location, com.snaphy.mapstrack.Constants.LOCATION_SHARE_BY_USER_FRAGMENT);
    recyclerView.setAdapter(locationShareAdapterContacts);
    com.snaphy.mapstrack.Helper.ContactMatcher contactMatcher = new com.snaphy.mapstrack.Helper.ContactMatcher(mainActivity, location, locationShareAdapterContacts);
    locationShareAdapterContacts.notifyDataSetChanged();
}