private void updateViews(java.util.List<com.johnhiott.darkskyandroidlib.models.DataPoint> dataPoints, java.lang.String offset) {
    com.desmond.myweatherapp.ListViewAdapter adapter = new com.desmond.myweatherapp.ListViewAdapter(getContext(), dataPoints, offset);
    listView.setAdapter(adapter);
}