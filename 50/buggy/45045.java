@org.springframework.web.bind.annotation.RequestMapping(value = "add", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String processAddCategoryForm(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.ModelAttribute
@javax.validation.Valid
com.nendejan.swag.models.EmployeeCategory employeeCategory, org.springframework.validation.Errors errors) {
    if (errors.hasErrors()) {
        model.addAttribute("title", "Add Category");
        return "employeeCategory/add";
    }
    employeeCategoryDao.save(employeeCategory);
    return "redirect:";
}