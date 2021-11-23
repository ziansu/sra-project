public void signIn(android.view.View view) {
    if (Settings.Secure.getString(this.getApplicationContext().getContentResolver(), Settings.Secure.ALLOW_MOCK_LOCATION).equals("1")) {
        android.widget.Toast.makeText(getApplicationContext(), "Please turn off location spoofing", Toast.LENGTH_LONG).show();
    }else {
        com.weebly.helloworldclub.phoenixnow.MainActivity.MyThread thread = new com.weebly.helloworldclub.phoenixnow.MainActivity.MyThread();
        thread.start();
    }
}