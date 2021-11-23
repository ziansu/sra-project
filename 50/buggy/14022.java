@java.lang.Override
public void onError(java.lang.String error) {
    android.widget.Toast.makeText(getActivity(), error, Toast.LENGTH_LONG).show();
    pDialog.hide();
}