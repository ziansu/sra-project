public void selectAllImages() {
    for (vn.mbm.phimp.me.ImageItem imageItem : vn.mbm.phimp.me.newGallery.localImageList) {
        imageItem.isSelected = true;
        deletableList.add(imageItem.path);
    }
    notifyDataSetChanged();
}