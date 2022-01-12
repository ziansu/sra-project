public static boolean willHandleActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    return (((requestCode == (EasyImageConfig.REQ_SOURCE_CHOOSER)) || (requestCode == (EasyImageConfig.REQ_PICK_PICTURE_FROM_GALLERY))) || (requestCode == (EasyImageConfig.REQ_TAKE_PICTURE))) || (requestCode == (EasyImageConfig.REQ_PICK_PICTURE_FROM_DOCUMENTS));
}