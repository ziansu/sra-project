public void play(android.view.View view) {
    android.widget.EditText countView = ((android.widget.EditText) (findViewById(R.id.count)));
    int level = java.lang.Integer.parseInt(countView.getText().toString());
    android.content.Intent intent = new android.content.Intent(this, dot.satellitehack.SatelliteHackActivity.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
    intent.putExtra("level", level);
    startActivityForResult(intent, dot.satellitehack.MainActivity.SAT_HACK_ID);
}