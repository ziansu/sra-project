private void setDefaultRealmDB() {
    if ((helper.getCategories().size()) <= 0) {
        helper.insertCategory(0, getString(R.string.other_category));
    }
    if ((helper.getLocations().size()) <= 0) {
        helper.insertLocation(0, getString(R.string.other_location));
    }
}