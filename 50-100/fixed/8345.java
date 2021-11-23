@org.springframework.web.bind.annotation.RequestMapping(value = "/get-menus", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<?> getMenus() {
    com.FoodCourtServer.controller.MenuController.LOGGER.info("fetching menus");
    java.util.List<com.FoodCourtServer.model.Menu> menus = menuService.getMenus();
    if (menus.isEmpty()) {
        com.FoodCourtServer.controller.MenuController.LOGGER.error("menus not found");
        return new org.springframework.http.ResponseEntity(new com.FoodCourtServer.util.CustomErrorType("menus not found"), org.springframework.http.HttpStatus.NOT_FOUND);
    }
    return new org.springframework.http.ResponseEntity(menus, org.springframework.http.HttpStatus.OK);
}