@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    int n = ((int) (picker.getValue()));
    nObservations = n + 1;
    nObsView.setText(("" + (nObservations)));
    nObsView.clearFocus();
    if ((nObservations) == 1) {
        nameLabel.setText(R.string.session_create_name);
    }else {
        nameLabel.setText(R.string.session_create_name_prefix);
    }
}