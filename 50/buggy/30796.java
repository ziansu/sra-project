public void sendAll(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.example.therr.kenpodefinitionapp.DisplaySearchActivity.class);
    intent.putExtra(com.example.therr.kenpodefinitionapp.MainActivity.EXTRA_SEARCH_ALL, true);
    intent.putExtra(com.example.therr.kenpodefinitionapp.MainActivity.EXTRA_ARRAY_LIST, arrTerms);
    startActivity(intent);
}