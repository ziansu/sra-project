@java.lang.Override
public javax.ws.rs.core.Response updateWorkItem(java.lang.Long id, se.teknikhogskolan.jaxson.model.WorkItemModel workItem) {
    if ((workItem.getUserNumber()) != null) {
        workItemService.setUser(workItem.getUserNumber(), workItem.getId());
    }
    if ((workItem.getStatus()) != null) {
        workItemService.setStatus(workItem.getId(), workItem.getStatus());
    }
    return javax.ws.rs.core.Response.ok().build();
}