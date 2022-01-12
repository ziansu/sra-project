private void updateViews(java.util.List<com.johnhiott.darkskyandroidlib.models.DataPoint> dataPoints) {
    com.desmond.myweatherapp.ListViewAdapter adapter = new com.desmond.myweatherapp.ListViewAdapter(getContext(), dataPoints);
    listView.setAdapter(adapter);
}