@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    android.widget.Toast.makeText(this, "onSaveInstanceState", Toast.LENGTH_SHORT).show();
    com.ci.marcopolo.EditPictureActivity.lineListBackup = drawer.getLineList();
}