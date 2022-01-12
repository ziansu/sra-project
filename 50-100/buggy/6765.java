@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
    android.view.LayoutInflater inflater = getActivity().getLayoutInflater();
    android.view.View v = inflater.inflate(R.layout.dialog_progress, null);
    builder.setView(v);
    return builder.create();
}