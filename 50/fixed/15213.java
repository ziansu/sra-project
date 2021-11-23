boolean imageViewReused(com.example.futin.importimages.RestService.loaders.PhotoToLoad photoToLoad) {
    java.lang.String tag = imageViews.get(photoToLoad.imageView);
    if ((tag == null) || (!(tag.equals(photoToLoad.url))))
        return true;
    
    return false;
}