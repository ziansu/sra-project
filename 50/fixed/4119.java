public void returnToMain() {
    finish();
    android.content.Intent intent = new android.content.Intent(this, com.ericabraham.leapfrog.MainActivity.class);
    startActivity(intent);
    finish();
}