@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case 0 :
            android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(intent, COMPLAINT_IMAGE_ONE_REQUEST_CODE_GALLERY);
            break;
        case 1 :
            intent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent, COMPLAINT_IMAGE_ONE_REQUEST_CODE_IMAGE);
            break;
    }
}