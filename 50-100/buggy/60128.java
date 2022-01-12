@java.lang.Override
public boolean removeImageInGroup(java.lang.Integer id) {
    try {
        com.framgia.model.Image image = getImageDAO().findById(id, true);
        image.setDateUpdate(com.framgia.util.DateUtil.getDateNow());
        image.setUserUpdate(com.framgia.util.Helpers.getUsername());
        com.framgia.model.Group group = new com.framgia.model.Group();
        group.setId(idFreeGroup);
        image.setGroup(group);
        imageDAO.saveOrUpdate(image);
        return true;
    } catch (java.lang.Exception e) {
        com.framgia.service.impl.ImageServiceImpl.logger.error("remove image throw out group error", e);
        throw e;
    }
}