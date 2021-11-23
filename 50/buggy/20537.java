@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    android.support.design.widget.Snackbar.make(view, "Reported!", android.support.design.widget.Snackbar.LENGTH_SHORT).show();
    callBack.completed();
}