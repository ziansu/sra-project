public void run() {
    try {
        java.lang.Thread.sleep((1 * 1000));
        android.content.Intent i = new android.content.Intent(getBaseContext(), hr.mc2.tvz.humanitarko.MainActivity.class);
        startActivity(i);
        finish();
    } catch (java.lang.Exception e) {
    }
}