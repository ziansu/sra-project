public void openImageSelector(android.view.View view) {
    android.content.Intent intent;
    if ((Build.VERSION.SDK_INT) < 19) {
        intent = new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT);
    }else {
        intent = new android.content.Intent(android.content.Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
    }
    intent.setType("image/*");
    startActivityForResult(android.content.Intent.createChooser(intent, "Select Picture"), pl.lukaszpelczar.p10_udacity_inventory.DetailActivity.PICK_IMAGE_REQUEST);
}