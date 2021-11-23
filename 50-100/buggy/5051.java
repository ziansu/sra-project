@java.lang.Override
public void onClick(android.view.View view) {
    if (localValidation()) {
        android.widget.Toast.makeText(getContext(), getContext().getString(R.string.new_repo_successfully_added), Toast.LENGTH_LONG).show();
        new ch.cern.cvmfs.dialogs.AddRepositoryDialog.TestRepository(repoURL.getText().toString()).execute();
        dismiss();
    }else {
        android.widget.Toast.makeText(getContext(), getContext().getString(R.string.new_repo_bad_input), Toast.LENGTH_LONG).show();
    }
}