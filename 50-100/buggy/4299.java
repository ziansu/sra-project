@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    db.open();
    db.deleteService(service);
    db.close();
    mListView.removeViewInLayout(viewToDelete);
    mAdapter.notifyDataSetChanged();
    com.example.balinator.androidprojekt.MainActivity.updateMyWidgets(context);
}