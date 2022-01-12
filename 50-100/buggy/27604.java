private void redirectToMainScreen() {
    (callbackCount)++;
    if (((callbackCount) > 3) && (!(errorOccured))) {
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), dhbw.mobile2.MainActivity.class);
        startActivity(intent);
    }else {
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), dhbw.mobile2.LogInActivity.class);
        startActivity(intent);
    }
}