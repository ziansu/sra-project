@one.kii.kiimate.model.core.ctl.RequestMapping(method = RequestMethod.POST, consumes = { org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE })
public org.springframework.http.ResponseEntity<one.kii.kiimate.model.core.api.DeclareExtensionApi.CommitReceipt> commitJson(@one.kii.kiimate.model.core.ctl.RequestHeader(value = one.kii.summer.io.context.ErestHeaders.REQUEST_ID)
java.lang.String requestId, @one.kii.kiimate.model.core.ctl.RequestHeader(value = one.kii.summer.io.context.ErestHeaders.OPERATOR_ID)
java.lang.String operatorId, @one.kii.kiimate.model.core.ctl.PathVariable(value = one.kii.kiimate.model.core.ctl.DeclareExtensionCtl.OWNER_ID)
java.lang.String ownerId, @one.kii.kiimate.model.core.ctl.RequestBody
one.kii.kiimate.model.core.api.DeclareExtensionApi.CommitForm form) {
    return commit(requestId, operatorId, ownerId, form);
}