private android.content.Intent createShareTrailerIntent() {
    android.content.Intent shareIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    shareIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
    shareIntent.setType("text/plain");
    if ((mTrailer.size()) > 0) {
        shareIntent.putExtra(Intent.EXTRA_TEXT, mTrailer.get(0).getUrl());
        return shareIntent;
    }
    return null;
}