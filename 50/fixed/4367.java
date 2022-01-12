private void readPreferences() {
    mSearch = sharedPreferences.getString("search", ApiHelper.API_TOP_RATED);
    getActivity().setTitle(mSearch.toUpperCase().replace("_", " "));
}