private boolean hasData() {
    return ((((mPDFs) != null) && ((mImages) != null)) && ((mLinks) != null)) && (((!(mPDFs.isEmpty())) || (!(mImages.isEmpty()))) || (!(mLinks.isEmpty())));
}