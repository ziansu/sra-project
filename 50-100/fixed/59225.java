@java.lang.Override
public void onClick(android.view.View v) {
    if (selectedAssets.isEmpty()) {
        android.widget.Toast.makeText(activity, "You haven't selected any items.", Toast.LENGTH_SHORT).show();
    }else {
        presenter.moveAssets(selectedAssets);
        presenter.loadCurrentContents(false);
    }
    presenter.loadCurrentContents(false, nz.ac.aut.comp705.sortmystuff.util.AppCode.CONTENTS_DEFAULT_MODE);
}