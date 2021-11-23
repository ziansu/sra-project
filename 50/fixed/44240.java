protected java.lang.Boolean doInBackground(java.lang.String... urls) {
    str = "Doing Button2Task ...\n";
    str += ("param = " + (urls[0])) + "\n";
    handler.post(myRunnable);
    return true;
}