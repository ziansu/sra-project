public void done(java.lang.String result, com.parse.ParseException e) {
    if (e == null) {
        android.util.Log.i("Results :", result);
    }else {
        android.util.Log.i("Error", e.getMessage());
    }
}