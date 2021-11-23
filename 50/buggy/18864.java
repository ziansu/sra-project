public void chooseImageFromGallery() {
    android.content.Intent pictureFromGalleryIntent = new android.content.Intent(android.content.Intent.ACTION_PICK);
    pictureFromGalleryIntent.setType("image/*");
    startActivityForResult(pictureFromGalleryIntent, com.lucianoleitefabris.inventoryapp.ProductDetailsActivity.GALLERY_REQUEST);
}