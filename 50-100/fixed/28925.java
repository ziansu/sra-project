@java.lang.SuppressWarnings(value = "unchecked")
public com.percero.framework.vo.IPerceroObject cleanObject(com.percero.framework.vo.IPerceroObject perceroObject, java.lang.String userId) throws com.percero.agents.sync.exceptions.SyncException {
    if (perceroObject == null)
        return null;
    
    com.percero.agents.sync.dao.IDataAccessObject<com.percero.framework.vo.IPerceroObject> dao = ((com.percero.agents.sync.dao.IDataAccessObject<com.percero.framework.vo.IPerceroObject>) (com.percero.agents.sync.dao.DAORegistry.getInstance().getDataAccessObject(perceroObject.getClass().getCanonicalName())));
    perceroObject = dao.cleanObjectForUser(perceroObject, userId);
    return perceroObject;
}