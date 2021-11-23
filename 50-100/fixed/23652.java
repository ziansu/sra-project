@org.launchcode.controllers.RequestMapping(value = "add-item", method = RequestMethod.POST)
public java.lang.String addItem(org.springframework.ui.Model model, @org.launchcode.controllers.ModelAttribute
@javax.validation.Valid
org.launchcode.models.forms.AddMenuItemForm form, org.springframework.validation.Errors errors) {
    if (errors.hasErrors()) {
        model.addAttribute("form", form);
        return "menu/add-item";
    }
    org.launchcode.models.Menu menu = menuDao.findOne(form.getMenuId());
    org.launchcode.models.Cheese cheese = cheeseDao.findOne(form.getCheeseId());
    menu.addItem(cheese);
    menuDao.save(menu);
    return "redirect:/menu/view/" + (menu.getId());
}