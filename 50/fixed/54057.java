@org.springframework.web.bind.annotation.RequestMapping(value = "/getCategories", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<woodstore.controller.Category> getCategories() {
    return categoryService.findAll();
}