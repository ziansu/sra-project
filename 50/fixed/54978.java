public void startSingleSemesterActivity(java.lang.String number) {
    android.content.Intent i = new android.content.Intent(this, com.example.menuka.loginandregistration.SingleSemesterActivity.class);
    i.putExtra("semester", number);
    startActivity(i);
    finish();
}