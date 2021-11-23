protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (FILTER_REQUEST_CODE)) {
        int date = data.getExtras().getInt("date", 0);
        sortOrder = data.getExtras().getString("sortOrder");
        fields = data.getExtras().getStringArrayList("fields");
        beginDate = date;
        fetchMoreData(0);
    }
}