@java.lang.Override
public void processFinish(java.lang.String output) {
    if (output != null) {
        int stop = output.indexOf(",");
        int start = output.indexOf(":");
        java.lang.String result = output.substring(start, stop);
        mText_distance.setText(((getString(R.string.distance)) + result));
    }
}