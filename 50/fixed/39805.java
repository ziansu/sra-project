@java.lang.Override
protected byte[] doInBackground(java.lang.String... params) {
    addLayer2MapView(mSelectedClass);
    addLegend2MapView(mSelectedClass);
    return null;
}