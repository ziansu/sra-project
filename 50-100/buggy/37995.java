public void onFinish() {
    textView2.setText(R.string.done);
    android.content.Intent myIntent = new android.content.Intent(this, com.example.android.sailingquiz.MainActivity.class);
    myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    this.startActivity(myIntent);
    android.widget.Toast.makeText(this, R.string.toast, Toast.LENGTH_LONG).show();
    userScores();
    finish();
}