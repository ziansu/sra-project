@org.springframework.security.access.prepost.PreAuthorize(value = "hasAuthority('ROLE_ADMIN')")
@com.visiblebrain.backend.controllers.RequestMapping(value = "/update", method = RequestMethod.POST)
@com.visiblebrain.backend.controllers.ResponseBody
public com.visiblebrain.backend.model.OverlayInfo update(@com.visiblebrain.backend.controllers.RequestBody
com.visiblebrain.backend.model.OverlayInfo o) {
    return overlayInfoService.update(o);
}