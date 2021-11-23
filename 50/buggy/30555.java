@com.tsystems.jschool20.controllers.RequestMapping(method = RequestMethod.POST, path = "/saveEditRate", consumes = "application/json")
public void saveEditRate(@com.tsystems.jschool20.controllers.RequestBody
com.tsystems.jschool20.srvengine.dtos.DTORate dto) {
    logger.info("Add new rate controller method.");
    logger.debug(dto.toString());
    rateService.saveEditRate(dto);
}