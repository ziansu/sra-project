public int flip(java.lang.String imageId, boolean horizontal) {
    com.google.appengine.api.blobstore.BlobKey key = new com.google.appengine.api.blobstore.BlobKey("xx");
    com.gruppe4b.edivator.backend.service.Image resizeImage = com.gruppe4b.edivator.backend.service.ImagesServiceFactory.makeImageFromBlob(key);
    com.gruppe4b.edivator.backend.service.Transform transform;
    if (horizontal == true) {
        transform = com.gruppe4b.edivator.backend.service.ImagesServiceFactory.makeHorizontalFlip();
    }else
        if (horizontal == false) {
            transform = com.gruppe4b.edivator.backend.service.ImagesServiceFactory.makeVerticalFlip();
        }
    
    com.gruppe4b.edivator.backend.service.Image flippedImage = imagesService.applyTransform(transform, flippingImage);
    int newId = 0;
    return newId;
}