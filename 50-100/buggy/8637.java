public void openImageSelector(android.view.View view) {
    android.content.Intent intent;
    android.util.Log.e(pl.lukaszpelczar.p10_udacity_inventory.DetailActivity.LOG_TAG, "While is set and the ifs are worked through.");
    if ((Build.VERSION.SDK_INT) < 19) {
        intent = new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT);
    }else {
        intent = new android.content.Intent(android.content.Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
    }
    android.util.Log.e(pl.lukaszpelczar.p10_udacity_inventory.DetailActivity.LOG_TAG, "Check write to external permissions");
    intent.setType("image/*");
    startActivityForResult(android.content.Intent.createChooser(intent, "Select Picture"), pl.lukaszpelczar.p10_udacity_inventory.DetailActivity.PICK_IMAGE_REQUEST);
}