@java.lang.Override
public void onClick(android.view.View v) {
    if (fam != null)
        fam.collapse();
    
    vibrate();
    de.interoberlin.poisondartfrog.view.dialogs.MappingDialog dialog = new de.interoberlin.poisondartfrog.view.dialogs.MappingDialog();
    android.os.Bundle b = new android.os.Bundle();
    b.putCharSequence(getResources().getString(R.string.bundle_dialog_title), getResources().getString(R.string.mapping));
    dialog.setArguments(b);
    dialog.show(getFragmentManager(), ScanResultsDialog.TAG);
}