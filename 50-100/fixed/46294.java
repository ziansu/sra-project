@org.springframework.web.bind.annotation.RequestMapping(value = "/rest/editor-groups", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.flowable.app.model.common.ResultListDataRepresentation getGroups(@org.springframework.web.bind.annotation.RequestParam(required = false, value = "filter")
java.lang.String filter) {
    java.util.List<org.flowable.app.model.common.GroupRepresentation> result = new java.util.ArrayList<org.flowable.app.model.common.GroupRepresentation>();
    java.util.List<org.flowable.app.model.common.RemoteGroup> groups = remoteIdmService.findGroupsByNameFilter(filter);
    for (org.flowable.app.model.common.RemoteGroup group : groups) {
        result.add(new org.flowable.app.model.common.GroupRepresentation(group));
    }
    return new org.flowable.app.model.common.ResultListDataRepresentation(result);
}