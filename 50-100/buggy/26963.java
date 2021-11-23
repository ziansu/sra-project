@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String name = etName.getText().toString();
    java.lang.String link = etLink.getText().toString();
    android.util.Log.d(de.appphil.webcamviewerwidget.activities.LinkListActivity.TAG, ((("User input: " + name) + " ") + link));
    linkDbManager.addLink(name, link);
    updateRecyclerView(false);
    dialog.dismiss();
}