public java.lang.Long addToIndexQueue(java.awt.image.BufferedImage image, java.lang.Long id, java.util.Map<java.lang.String, java.lang.String> properties) throws retrieval.storage.TooMuchIndexRequestException {
    retrieval.storage.Storage.logger.debug(("addToIndexQueue=" + id));
    while (id == null) {
        id = (java.lang.System.currentTimeMillis()) + (new java.util.Random().nextLong());
        if (index.isPictureAlreadyIndexed(id)) {
            id = null;
        }
    } 
    threadIndex.addInIndexPicture(image, id, new java.util.HashMap<java.lang.String, java.lang.String>(properties));
    return id;
}