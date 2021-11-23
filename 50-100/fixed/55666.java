@org.springframework.web.bind.annotation.RequestMapping(value = "/action/device/index/session", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = "application/json", produces = "application/json")
@org.springframework.security.access.annotation.Secured(value = { eu.daiad.web.model.security.RoleConstant.ROLE_USER })
public eu.daiad.web.model.RestResponse getSession(@org.springframework.security.core.annotation.AuthenticationPrincipal
eu.daiad.web.model.security.AuthenticatedUser user, @org.springframework.web.bind.annotation.RequestBody
eu.daiad.web.model.amphiro.AmphiroSessionIndexIntervalQuery query) {
    try {
        this.checkAmphiroOwnership(user.getKey(), query.getDeviceKey());
        query.setUserKey(user.getKey());
        return amphiroIndexOrderedRepository.getSession(query);
    } catch (java.lang.Exception ex) {
        eu.daiad.web.controller.action.SearchController.logger.error(ex.getMessage(), ex);
        return new eu.daiad.web.model.RestResponse(getError(ex));
    }
}