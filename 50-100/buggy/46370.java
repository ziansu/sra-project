@org.springframework.web.bind.annotation.RequestMapping(value = "/search-menus-by-name/{name}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<?> searchMenusByName(@org.springframework.web.bind.annotation.PathVariable(value = "name")
java.lang.String name) {
    com.FoodCourtServer.controller.MenuController.LOGGER.info((("search menu with " + name) + " keyword"));
    java.util.List<com.FoodCourtServer.model.Menu> menus = menuService.searchMenusByName(name);
    if (menus == null) {
        com.FoodCourtServer.controller.MenuController.LOGGER.error((("menus with name " + name) + " not found"));
        return new org.springframework.http.ResponseEntity(new com.FoodCourtServer.util.CustomErrorType((("menus with name " + name) + " not found")), org.springframework.http.HttpStatus.NOT_FOUND);
    }
    return new org.springframework.http.ResponseEntity(menus, org.springframework.http.HttpStatus.OK);
}