@org.springframework.web.bind.annotation.RequestMapping(value = { "/pages/{action}/department" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String actionDepartment(@org.springframework.web.bind.annotation.PathVariable(value = "action")
java.lang.String action, @org.springframework.web.bind.annotation.ModelAttribute(value = "model")
org.springframework.ui.ModelMap model, org.springframework.validation.BindingResult bindingResult, java.util.Locale locale, @org.springframework.web.bind.annotation.RequestParam(value = "id", required = false)
java.lang.String id) {
    boolean viewOnly = (!(isEditor())) || ("view".equals(action));
    model.addAttribute("viewOnly", viewOnly);
    if (org.springframework.util.StringUtils.isEmpty(id)) {
        return "/pages/edit-department";
    }
    com.semenov.rightnabove.test.model.Department department = departmentDao.getById(java.lang.Long.valueOf(id));
    model.addAttribute("department", department);
    return "/pages/edit-department";
}