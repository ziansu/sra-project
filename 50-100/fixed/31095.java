public long getNumOfPages(int imagesPerPage) throws java.lang.Exception {
    long numberOfImages;
    long numPages = 0;
    com.service.GalleryImageService service = null;
    try {
        service = new com.service.GalleryImageServiceImpl();
        numberOfImages = service.getCountOfAllPictures();
        if (numberOfImages > 0) {
            numPages = numberOfImages / imagesPerPage;
            if ((numPages > 1) && ((numberOfImages % imagesPerPage) > 1)) {
                numPages = numPages + 1;
            }
        }
        return numPages;
    } catch (java.lang.Exception e) {
        throw e;
    }
}