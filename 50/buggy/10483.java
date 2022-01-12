@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    saveTask.execute();
    startLoadImageIntent();
    org.catrobat.paintroid.dialog.LayersDialog.getInstance().resetLayer();
}