@java.lang.Override
public java.lang.Void runInTransaction() {
    if (((asyncTask.getChildCmdEntity().getRootCommandId()) != null) && (!(asyncTask.getChildCmdEntity().getRootCommandId().equals(asyncTask.getChildCmdEntity().getId())))) {
        coco.persistCommand(asyncTask.getRootCmdEntity());
    }
    coco.persistCommand(asyncTask.getChildCmdEntity());
    org.ovirt.engine.core.dal.dbbroker.DbFacade.getInstance().getAsyncTaskDao().saveOrUpdate(asyncTask);
    return null;
}