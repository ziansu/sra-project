private void submitEdits() {
    android.content.Intent returnIntent = new android.content.Intent();
    returnIntent.setData(videoUri);
    returnIntent.putExtra(com.psu.capstonew17.pdxaslapp.EditVideoActivity.START, importOptions.startTime);
    returnIntent.putExtra(com.psu.capstonew17.pdxaslapp.EditVideoActivity.END, importOptions.endTime);
    returnIntent.putExtra(com.psu.capstonew17.pdxaslapp.EditVideoActivity.CROP, importOptions.cropRegion);
    returnIntent.putExtra(com.psu.capstonew17.pdxaslapp.EditVideoActivity.QUALITY, importOptions.quality);
    setResult(Activity.RESULT_OK, returnIntent);
    finish();
}