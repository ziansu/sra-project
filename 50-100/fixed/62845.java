@org.springframework.web.bind.annotation.RequestMapping(value = "/users/{id}", method = PUT, headers = ACCEPT_JSON)
@org.springframework.security.access.prepost.PreAuthorize(value = "@permissionEvaluator.hasPermission(principal,'MANAGE_USER')")
public org.springframework.http.ResponseEntity<org.openlmis.core.web.OpenLmisResponse> update(@org.springframework.web.bind.annotation.RequestBody
org.openlmis.core.domain.User user, @org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Long id, javax.servlet.http.HttpServletRequest request) {
    user.setModifiedBy(loggedInUserId(request));
    user.setId(id);
    try {
        userService.update(user);
    } catch (org.openlmis.core.exception.DataException e) {
        return error(e, org.openlmis.web.controller.BAD_REQUEST);
    }
    return new org.openlmis.core.web.OpenLmisResponse().response(org.openlmis.web.controller.OK);
}