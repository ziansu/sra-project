@java.lang.Override
public void onItemClick(android.view.View view, int position) {
    final gun0912.tedbottompicker.adapter.ImageGalleryAdapter.PickerTile pickerTile = imageGalleryAdapter.getItem(position);
    switch (pickerTile.getTileType()) {
        case ImageGalleryAdapter.PickerTile.CAMERA :
            startCameraIntent();
            break;
        case ImageGalleryAdapter.PickerTile.GALLERY :
            startGalleryIntent();
            break;
        case ImageGalleryAdapter.PickerTile.IMAGE :
            complete(new java.util.ArrayList<android.net.Uri>() {
                {
                    add(pickerTile.getImageUri());
                }
            });
            break;
        default :
            errorMessage();
    }
}