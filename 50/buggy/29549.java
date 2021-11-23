public void sketchesBtnOnClick(android.view.View view) {
    android.content.Intent sketchesIntent = new android.content.Intent(getBaseContext(), com.blackteam.dsketches.ui.SketchesActivity.class);
    sketchesIntent.putExtra(com.blackteam.dsketches.ui.MainMenuActivity.EXTRA_SKETCHES_DATA, getIntent().getExtras().getBundle(SketchesActivity.EXTRA_SKETCHES_DATA));
    startActivity(sketchesIntent);
}