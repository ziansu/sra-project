public void newPainting(boolean isPortraitCheck) {
    android.content.Intent paintIntent = new android.content.Intent(this, games.angusgaming.anguspaint.PaintActivity.class);
    paintIntent.putExtra("isPortrait", isPortraitCheck);
    paintIntent.putExtra("isLoad", isLoad);
    startActivity(paintIntent);
    this.finish();
}