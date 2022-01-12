private com.jph.takephoto.model.CropOptions getCropOptions() {
    int height = 400;
    int width = 400;
    com.jph.takephoto.model.CropOptions.Builder builder = new com.jph.takephoto.model.CropOptions.Builder();
    builder.setAspectX(width).setAspectY(height);
    builder.setWithOwnCrop(false);
    return builder.create();
}