public void uploadActionInitiated(java.lang.String title, java.lang.String description) {
    this.title = title;
    this.description = description;
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.READ_EXTERNAL_STORAGE }, 4);
        }else {
            uploadBegins();
        }
    }else {
        uploadBegins();
    }
}