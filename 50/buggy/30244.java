public void uploadSamplesToGithub(android.view.View v) {
    android.content.Intent myIntent = new android.content.Intent(this, de.volzo.tapper.RecordActivity.class);
    myIntent.putExtra("GESTURE", GestureType.DOUBLETAP);
    this.startActivity(myIntent);
}