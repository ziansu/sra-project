@java.lang.Override
public boolean removeImageInGroup(java.lang.Integer id) {
    try {
        com.framgia.model.Image image = getImageDAO().findById(id, true);
        imageDAO.delete(image);
        return true;
    } catch (java.lang.Exception e) {
        com.framgia.service.impl.ImageServiceImpl.logger.error("remove image throw out group error", e);
        throw e;
    }
}