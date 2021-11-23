@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int item) {
    boolean result = com.onemoreerror.sampletask.PermissionUtils.PermissionChecker.checkCameraPermission(this);
    if (items[item].equals("Take Photo")) {
        if (result && readWritePermission)
            cameraIntent();
        
    }else
        if (items[item].equals("Choose Photo From Library")) {
            if (result && readWritePermission)
                galleryIntent();
            
        }else
            if (items[item].equals("Cancel")) {
                dialog.dismiss();
            }
        
    
}