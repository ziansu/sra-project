@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    jsonAccessToken = s;
    checkExistUserAccount();
}