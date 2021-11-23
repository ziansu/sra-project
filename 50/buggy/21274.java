@org.springframework.security.access.prepost.PreAuthorize(value = "hasAuthority('ROLE_ADMIN')")
@com.visiblebrain.backend.controllers.RequestMapping(value = "/{id}", method = RequestMethod.PUT)
@com.visiblebrain.backend.controllers.ResponseBody
public com.visiblebrain.backend.model.OverlayInfo update(@com.visiblebrain.backend.controllers.PathVariable(value = "id")
long id, @com.visiblebrain.backend.controllers.RequestBody
com.visiblebrain.backend.model.OverlayInfo o) {
    com.visiblebrain.backend.controllers.OverlayInfoController.LOGGER.debug(("ID: " + id));
    return overlayInfoService.update(id, o);
}