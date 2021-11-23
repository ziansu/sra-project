@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.DELETE, value = "{id}")
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Boolean deleteForm(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Long formId) {
    com.krishagni.catissueplus.core.common.events.BulkDeleteEntityOp op = new com.krishagni.catissueplus.core.common.events.BulkDeleteEntityOp();
    op.setIds(java.util.Collections.singleton(formId));
    com.krishagni.catissueplus.core.common.events.ResponseEvent<java.lang.Boolean> resp = formSvc.deleteForms(getRequest(op));
    resp.throwErrorIfUnsuccessful();
    return resp.getPayload();
}