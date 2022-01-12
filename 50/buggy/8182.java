@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(getContext(), "OK", Toast.LENGTH_LONG).show();
    com.example.haitran.cura.fragments.CustomDialogChoiceFolderToSave customDialogChoiceFolderToSave = new com.example.haitran.cura.fragments.CustomDialogChoiceFolderToSave(getActivity(), mData);
    customDialogChoiceFolderToSave.onCreateDialog();
}