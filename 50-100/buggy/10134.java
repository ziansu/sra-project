public void fillMap() {
    double latitude;
    double longitude;
    java.lang.String title;
    int type_id;
    values.clear();
    mMap.clear();
    cursor = getActivity().getContentResolver().query(EcoMapContract.ProblemsEntry.CONTENT_URI, null, null, null, null, null);
    while (cursor.moveToNext()) {
        org.ecomap.android.app.Problem p = new org.ecomap.android.app.Problem(cursor, getActivity());
        values.add(p);
    } 
    cursor.close();
    setUpClusterer();
}