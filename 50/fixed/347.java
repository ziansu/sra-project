public static boolean removePhotos(java.util.Collection<cz.cvut.fjfi.pvs.pvs2016.model.Photo> photoList) {
    boolean cacheHasChanged = false;
    for (cz.cvut.fjfi.pvs.pvs2016.model.Photo photo : photoList) {
        cacheHasChanged = (cz.cvut.fjfi.pvs.pvs2016.PhotosStaticCache.removePhoto(photo)) || cacheHasChanged;
    }
    return cacheHasChanged;
}