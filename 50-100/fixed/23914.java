public void onFinish() {
    textView2.setText(R.string.done);
    android.content.Intent myIntent = new android.content.Intent(this, com.example.android.sailingquiz.MainActivity.class);
    android.widget.Toast.makeText(this, R.string.toast, Toast.LENGTH_LONG).show();
    userScores();
    result();
    this.startActivity(myIntent);
    finish();
}