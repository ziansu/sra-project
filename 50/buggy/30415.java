private org.springframework.http.ResponseEntity<one.kii.kiimate.model.core.api.DeclareExtensionApi.CommitReceipt> commit(java.lang.String requestId, java.lang.String operatorId, java.lang.String ownerId, one.kii.kiimate.model.core.api.DeclareExtensionApi.CommitForm form) {
    one.kii.summer.io.context.WriteContext context = buildContext(requestId, operatorId, ownerId);
    return one.kii.summer.asdf.api.CommitApiCaller.sync(api, context, form);
}