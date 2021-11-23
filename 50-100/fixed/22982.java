@org.springframework.web.bind.annotation.RequestMapping(value = "/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String showCityCenter(@org.springframework.web.bind.annotation.RequestParam
java.util.Map<java.lang.String, java.lang.String> allRequestParams, org.springframework.ui.Model model) {
    org.exschool.pocketworld.controllers.city.center.CityCenterController.LOGGER.info(("Requested params:" + allRequestParams));
    commonCityService.buildQueuedBuildings(org.exschool.pocketworld.controllers.city.center.CityCenterController.PLAYER_NAME);
    org.exschool.pocketworld.city.center.dto.CityCenterDto cityCenterDto = cityCenterService.cityCenterInfo(org.exschool.pocketworld.controllers.city.center.CityCenterController.PLAYER_NAME);
    model.addAttribute("dto", cityCenterDto);
    java.util.Set<java.lang.String> builtBuildingTypes = cityCenterDto.getBuildingTypes();
    model.addAttribute("buildingTypes", cityCenterService.availableForBuildBuildingTypes(builtBuildingTypes));
    org.exschool.pocketworld.controllers.city.center.CityCenterController.LOGGER.info(("Out:" + model));
    return "city_center";
}