public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == 1) {
        java.lang.String filter = data.getStringExtra("filter");
        java.lang.String search = data.getStringExtra("search");
        filterActive = filter;
        searchActive = search;
    }
}