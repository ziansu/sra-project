@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.DELETE)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Boolean deleteForms(@org.springframework.web.bind.annotation.RequestParam(value = "id")
java.lang.Long[] ids) {
    com.krishagni.catissueplus.core.common.events.BulkDeleteEntityOp op = new com.krishagni.catissueplus.core.common.events.BulkDeleteEntityOp();
    op.setIds(new java.util.HashSet<>(java.util.Arrays.asList(ids)));
    com.krishagni.catissueplus.core.common.events.ResponseEvent<java.lang.Boolean> resp = formSvc.deleteForms(getRequest(op));
    resp.throwErrorIfUnsuccessful();
    return resp.getPayload();
}