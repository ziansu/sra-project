private void setPortraitAspectRatio() {
    double param = ((double) (mDisplayMetrics.widthPixels)) / ((double) (mDisplayMetrics.heightPixels));
    for (com.beautiful_wallpapers_hd_qhd.activity.CropImageActivity.ImageSizes size : com.beautiful_wallpapers_hd_qhd.activity.CropImageActivity.ImageSizes.values()) {
        if ((param > ((size.getRatio()) - 0.01)) && (param < ((size.getRatio()) + 0.01))) {
            setAspectRatio(size.getWidth(), size.getHeight());
            break;
        }
    }
}