@org.springframework.security.access.prepost.PreAuthorize(value = "@historySecurityService.hasPermissionToAccessByProductId(#productId)")
@org.springframework.web.bind.annotation.GetMapping(value = "/products/{productId}")
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public java.util.List<com.softserve.if072.common.model.History> getByProductId(@org.springframework.web.bind.annotation.PathVariable
int userId, @org.springframework.web.bind.annotation.PathVariable
int productId) {
    return historyService.getByProductId(userId, productId);
}