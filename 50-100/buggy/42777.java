@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int i) {
    if (changePictureDialogItems[i].equals(changePictureDialogItems[0])) {
        requestGalleryPermission();
    }else
        if (changePictureDialogItems[i].equals(changePictureDialogItems[1])) {
            requestCameraPermission();
        }else
            if (changePictureDialogItems[i].equals(changePictureDialogItems[2])) {
                if (type.equals("1")) {
                    sdvProfilepic.setImageBitmap(null);
                    textViewPlus.setVisibility(View.VISIBLE);
                }
            }
        
    
}