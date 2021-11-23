public void setWeatherDetailShareIntent(java.lang.String data) {
    if ((mShareActionProvider) != null) {
        if (data == null) {
            mShareActionProvider.setShareIntent(null);
        }else {
            android.content.Intent sharingIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Forecast Data");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, data);
            mShareActionProvider.setShareIntent(sharingIntent);
        }
    }
}