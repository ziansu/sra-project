@java.lang.Override
public void onDisconnected() {
    com.google.firebase.database.FirebaseDatabase.getInstance().goOffline();
    if ((getActivity().findViewById(android.R.id.content)) != null) {
        mSnackbar = android.support.design.widget.Snackbar.make(getActivity().findViewById(android.R.id.content), getString(R.string.connectivity_error_no_network), Snackbar.LENGTH_INDEFINITE);
        mSnackbar.show();
        mSnackbar.getView().setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View view) {
                mSnackbar.dismiss();
            }
        });
    }
}