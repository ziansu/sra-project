@com.ctlok.microservices.user.management.RequestMapping(value = "/{id}", method = RequestMethod.PUT)
public org.springframework.web.context.request.async.DeferredResult<com.ctlok.microservices.commons.external.RestResponse<com.ctlok.microservices.user.management.entity.User>> save(@com.ctlok.microservices.user.management.PathVariable(value = "id")
final java.lang.String id, @javax.validation.Valid
@com.ctlok.microservices.user.management.RequestBody
final com.ctlok.microservices.user.management.entity.User user) {
    user.setId(id);
    return com.ctlok.microservices.commons.external.utils.DeferredResultUtils.executeAsync(userManagementService.updateOrCreateUser(user));
}