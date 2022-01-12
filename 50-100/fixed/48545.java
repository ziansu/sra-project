@org.springframework.web.bind.annotation.RequestMapping(value = "add", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String processAddCategory(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.ModelAttribute
@javax.validation.Valid
org.launchcode.models.Category category, org.springframework.validation.Errors errors) {
    if (errors.hasErrors()) {
        model.addAttribute("title", "Add Category");
        model.addAttribute(category);
        return "category/add";
    }else {
        categoryDao.save(category);
        return "redirect:";
    }
}