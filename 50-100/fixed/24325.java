protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (FILTER_REQUEST_CODE)) {
        sortOrder = data.getExtras().getString("sortOrder");
        fields = data.getExtras().getStringArrayList("fields");
        beginDate = data.getExtras().getInt("date", 0);
        fetchMoreData(0);
    }
}