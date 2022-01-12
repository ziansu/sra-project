private void saveThumbnails() {
    for (jp.hazuki.yuzubrowser.tab.manager.TabIndexData data : mTabIndexDataList) {
        if (data.isThumbnailUpdated()) {
            byte[] image = jp.hazuki.yuzubrowser.utils.ImageUtils.bmp2byteArray(data.getThumbnail(), Bitmap.CompressFormat.WEBP, 60);
            if (image != null)
                saveThumbnail(data.getId(), image);
            
            data.setThumbnailUpdated(false);
        }
    }
}