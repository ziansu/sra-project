@java.lang.Override
public void onClick(android.view.View v) {
    com.legitdevs.legitnotes.ConfirmRemovalDialog.getInstance(getArguments()).show(getFragmentManager(), "dialog");
    com.legitdevs.legitnotes.Note note = getArguments().getParcelable(com.legitdevs.legitnotes.EditDialog.KEY_NOTE);
    int position = getArguments().getInt(com.legitdevs.legitnotes.EditDialog.KEY_POSITION);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putParcelable(com.legitdevs.legitnotes.EditDialog.KEY_NOTE, note);
    bundle.putInt(com.legitdevs.legitnotes.EditDialog.KEY_POSITION, position);
    com.legitdevs.legitnotes.ConfirmRemovalDialog.getInstance(bundle).show(getFragmentManager(), "dialog");
    dismiss();
}