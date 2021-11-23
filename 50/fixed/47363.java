@org.springframework.web.bind.annotation.RequestMapping(value = "/restaurant/{restaurantName}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView showMenu(@org.springframework.web.bind.annotation.PathVariable(value = "restaurantName")
java.lang.String name) {
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView("foodChoice/menu");
    com.about.java.model.MenuModel menuModel = new com.about.java.model.MenuModel();
    return menuModel.getMenu(name, mav);
}