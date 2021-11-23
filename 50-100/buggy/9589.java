@org.springframework.web.bind.annotation.RequestMapping(value = "/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String showCityResources(@org.springframework.web.bind.annotation.RequestParam
java.util.Map<java.lang.String, java.lang.String> allRequestParams, org.springframework.ui.Model model) {
    org.exschool.pocketworld.controllers.city.resources.CityResourcesController.LOGGER.info(("Requested params:" + allRequestParams));
    org.exschool.pocketworld.city.resources.dto.CityResourcesDto cityResourcesDto = cityResourcesService.cityResourcesInfo(org.exschool.pocketworld.controllers.city.resources.CityResourcesController.PLAYER_NAME);
    model.addAttribute("dto", cityResourcesDto);
    org.exschool.pocketworld.controllers.city.resources.CityResourcesController.LOGGER.info(("Out:" + model));
    commonCityService.buildQueuedBuildings(org.exschool.pocketworld.controllers.city.resources.CityResourcesController.PLAYER_NAME);
    return "city_resources";
}