public void setGridCovers(java.util.List<java.lang.String> imgPath) {
    for (int i = 0; (i < (imageViewList.size())) && (i < (imgPath.size())); i++) {
        com.jing.app.jjgallery.service.image.SImageLoader.getInstance().displayImage(imgPath.get(i), imageViewList.get(i));
    }
}