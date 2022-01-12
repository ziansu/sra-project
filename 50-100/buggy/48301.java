@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int choice) {
    switch (choice) {
        case 0 :
            dispatchTakePictureIntent();
            break;
        case 1 :
            dispatchGalleryPictureIntent();
            break;
        case 2 :
            android.util.Log.d("PHOTO", "Cancel clicked...");
            dialog.dismiss();
            break;
        case 3 :
            deleteImage(slider.getUrl());
            break;
    }
}