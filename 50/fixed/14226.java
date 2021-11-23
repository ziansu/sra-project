@org.springframework.web.bind.annotation.RequestMapping(value = "/pages/delete/employee", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String deleteEmployee(@org.springframework.web.bind.annotation.ModelAttribute(value = "model")
org.springframework.ui.ModelMap model, org.springframework.validation.BindingResult bindingResult, java.util.Locale locale, @org.springframework.web.bind.annotation.RequestParam(value = "id")
java.lang.Long id) {
    if (id != null) {
        employeeDao.deleteById(id);
    }
    return "redirect:/pages/employees.html";
}