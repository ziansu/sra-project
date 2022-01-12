public static void addCountriesFullList(org.json.JSONObject object) throws org.json.JSONException {
    net.ducksmanager.inducks.coa.CountryListing.addCountries(object);
    net.ducksmanager.inducks.coa.CountryListing.hasFullList = true;
}