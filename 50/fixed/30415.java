private org.springframework.http.ResponseEntity<one.kii.kiimate.model.core.api.DeclareExtensionApi.CommitReceipt> commit(java.lang.String requestId, java.lang.String ownerId, java.lang.String operatorId, one.kii.kiimate.model.core.api.DeclareExtensionApi.CommitForm form) {
    one.kii.summer.io.context.WriteContext context = buildContext(requestId, ownerId, operatorId);
    return one.kii.summer.asdf.api.CommitApiCaller.sync(api, context, form);
}