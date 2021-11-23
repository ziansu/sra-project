private android.content.Intent createShareIntent() {
    android.content.Intent shareIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    shareIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
    shareIntent.setType("text/plain");
    java.lang.String msg = (movie.getTitle()) + " ";
    if ((trailerResult.getTrailers().size()) > 0) {
        msg += trailerResult.getTrailers().get(0).getVideoUri();
    }
    shareIntent.putExtra(Intent.EXTRA_TEXT, msg);
    return shareIntent;
}