@java.lang.Override
public void onDialogPositiveClick(android.app.DialogFragment dialog, int index) {
    android.widget.TextView t = ((android.widget.TextView) (dialog.getDialog().findViewById(R.id.word)));
    if (index >= 0) {
        keys.set(index, t.getText().toString());
    }else {
        keys.add(t.getText().toString());
    }
    listAdapter.notifyDataSetChanged();
    updateWords();
    dialog.dismiss();
}