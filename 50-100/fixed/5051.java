@java.lang.Override
public void onClick(android.view.View view) {
    if (localValidation()) {
        new ch.cern.cvmfs.dialogs.AddRepositoryDialog.TestRepository(repoURL.getText().toString()).execute();
    }else {
        android.widget.Toast.makeText(getContext(), getContext().getString(R.string.new_repo_bad_input), Toast.LENGTH_LONG).show();
    }
}