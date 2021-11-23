private void shareNews() {
    android.content.Intent shareIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    shareIntent.setType("text/plain");
    shareIntent.putExtra(Intent.EXTRA_TEXT, (((com.example.mahmoud.movieapp.DetailActivityFragment.title) + "\n") + (com.example.mahmoud.movieapp.DetailActivityFragment.overview)));
    startActivity(android.content.Intent.createChooser(shareIntent, "Share using"));
}