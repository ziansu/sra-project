private void setImage() {
    if ((position) > 0) {
        pageWidget.setPreviousBitmap(getImageBitmap(((position) - 1)));
    }
    pageWidget.setCurrentBitmap(getImageBitmap(position));
    if ((position) < (images.length)) {
        pageWidget.setNextBitmap(getImageBitmap(((position) + 1)));
    }
}