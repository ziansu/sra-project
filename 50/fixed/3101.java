@java.lang.Override
public void onFailure(java.lang.String message) {
    if ((getActivity()) != null) {
        setRefreshIndicatorVisiblity(false);
        android.widget.Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
    }
}