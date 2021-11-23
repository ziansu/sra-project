private void error(java.lang.String data) {
    java.lang.String op = data.split(":")[0];
    java.lang.String error = data.substring(((op.length()) + 1));
    error.replaceAll("_", " ");
    error = (error.substring(0, 1).toUpperCase()) + (error.substring(1));
    android.util.Log.d("error", ((op + " ") + error));
    setErrorMessage(error);
}