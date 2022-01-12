public java.util.List<org.smartdata.model.ActionInfo> getNewCreatedActionsTableItem(int size) throws org.smartdata.metastore.MetaStoreException {
    if (size < 0) {
        return new java.util.ArrayList<>();
    }
    try {
        return actionDao.getLatestActions(size);
    } catch (org.springframework.dao.EmptyResultDataAccessException e) {
        return new java.util.ArrayList<>();
    } catch (java.lang.Exception e) {
        throw new org.smartdata.metastore.MetaStoreException(e);
    }
}