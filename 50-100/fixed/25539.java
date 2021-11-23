@java.lang.Override
public void onCompleted(java.lang.Exception e, java.lang.String result) {
    if (e != null) {
        android.util.Log.e(it.scripto.primetime4u.TAG, e.toString());
        android.widget.Toast.makeText(context, getString(R.string.generic_error), Toast.LENGTH_LONG).show();
        return ;
    }
    android.util.Log.i(it.scripto.primetime4u.TAG, result);
    progressBar.setVisibility(View.INVISIBLE);
    android.widget.Toast.makeText(context, R.string.taste_added, Toast.LENGTH_LONG).show();
}