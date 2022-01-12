public void newPainting(boolean isPortraitCheck) {
    android.content.Intent paintIntent = new android.content.Intent(this, games.angusgaming.anguspaint.PaintActivity.class);
    if (isPortraitCheck)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    else
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    
    paintIntent.putExtra("isPortrait", isPortraitCheck);
    paintIntent.putExtra("isLoad", isLoad);
    startActivity(paintIntent);
    this.finish();
}