public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case 0 :
            android.content.Intent i = new android.content.Intent(android.content.Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(i, SELECT_PICTURE);
            break;
        case 1 :
            org.fossasia.susi.ai.helper.PrefManager.putString(Constant.IMAGE_DATA, getString(R.string.background_no_wall));
            setChatBackground();
            break;
        case 2 :
            org.fossasia.susi.ai.helper.PrefManager.putString(Constant.IMAGE_DATA, getString(R.string.background_default));
            setChatBackground();
            break;
    }
}