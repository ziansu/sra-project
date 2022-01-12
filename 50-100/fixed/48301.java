@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int choice) {
    switch (choice) {
        case 0 :
            android.util.Log.d("PHOTO", "Cancel clicked...");
            dialog.dismiss();
            break;
        case 1 :
            deleteImage(slider.getUrl());
            break;
    }
}