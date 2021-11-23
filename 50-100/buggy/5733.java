@com.litrum.webproject.controller.RequestMapping(value = "/adminPannelSubMainCat", method = RequestMethod.POST)
public java.lang.String createSubMainCategory(org.springframework.ui.Model uiModel, @com.litrum.webproject.controller.ModelAttribute(value = "categories")
com.litrum.webproject.form.CategoriesForm categoriesForm) {
    try {
        com.litrum.webproject.controller.AdminController.logger.debug(" adminPannelSubMainCat : POST ");
        java.lang.System.out.println(categoriesForm.toString());
        userService.createSubMainCategory(categoriesForm);
        com.litrum.webproject.controller.AdminController.logger.debug("Sub Main Category created successfully.");
    } catch (java.lang.Exception e) {
        com.litrum.webproject.controller.AdminController.logger.debug(("Exception while createSubMainCategory :: " + (e.getMessage())));
    }
    return "redirect:adminPannelSubMainCat";
}