@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int item) {
    if (options[item].equals(getResources().getString(R.string.sign_up_camera))) {
        if (verifyOpenCamera()) {
            openCamera();
        }else {
            return ;
        }
    }else
        if (options[item].equals(getResources().getString(R.string.sign_up_libary_image))) {
            if (verifyCamerapermission()) {
                openGallery();
            }else {
                return ;
            }
        }
    
}