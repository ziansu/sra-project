@java.lang.Override
public void show() {
    if (!(com.github.angads25.filepicker.utils.Utility.checkStorageAccessPermissions(context))) {
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
            android.widget.Toast.makeText(context, "Application needs you permission to access SD Card", Toast.LENGTH_LONG).show();
            ((android.app.Activity) (context)).requestPermissions(new java.lang.String[]{ Manifest.permission.READ_EXTERNAL_STORAGE }, com.github.angads25.filepicker.view.FilePickerDialog.EXTERNAL_READ_PERMISSION_GRANT);
        }
    }else {
        super.show();
    }
}