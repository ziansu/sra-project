@org.springframework.web.bind.annotation.RequestMapping(value = "/doedit", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String editComplete(org.springframework.ui.Model model, com.monstarlab.domain.form.EmployeeInfoInputForm employeeInfoForm, org.springframework.validation.BindingResult bindingResult, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    com.monstarlab.domain.model.Employee employee = employeeInfoForm.getEmployee();
    java.lang.System.out.println(("lol " + (employeeInfoForm.getBirthdate())));
    employee.setBirthdate(convertToDate(employeeInfoForm.getBirthdate()));
    employeeService.update(employeeInfoForm.getEmployee());
    return "redirect:/";
}