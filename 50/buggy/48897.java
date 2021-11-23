@java.lang.Override
public void execute(com.duggan.workflow.shared.requests.InsertDataRequest action, com.duggan.workflow.shared.responses.BaseResponse actionResult, com.gwtplatform.dispatch.rpc.server.ExecutionContext execContext) throws com.gwtplatform.dispatch.shared.ActionException {
    com.duggan.workflow.server.dao.helper.CatalogDaoHelper.saveData(action.getCatalogId(), action.getLines());
}