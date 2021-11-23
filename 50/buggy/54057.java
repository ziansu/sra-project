@org.springframework.web.bind.annotation.RequestMapping(value = "/getCategories", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<woodstore.controller.Category> getCategories() {
    java.lang.System.out.println("Прилетело!");
    return categoryService.findAll();
}