public void clearCache() {
    if ((image) == null) {
        return ;
    }
    image.flush();
    image = null;
}