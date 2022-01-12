@com.saggezza.assetmanagement.controller.RequestMapping(method = RequestMethod.GET, headers = "Accept=*/*", produces = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@com.saggezza.assetmanagement.controller.ResponseBody
public com.saggezza.assetmanagement.controller.GridDTO getAll(final org.springframework.ui.ModelMap modelMap, @com.saggezza.assetmanagement.controller.RequestParam(value = "type")
final java.lang.String type) {
    java.util.List data = transformToDTO(type, metaDataService.getAll(type));
    com.saggezza.assetmanagement.controller.GridDTO gridDTO = new com.saggezza.assetmanagement.controller.GridDTO(1, data.size(), data.size(), data, "");
    return gridDTO;
}