@org.springframework.web.bind.annotation.RequestMapping(value = "/createEmployee", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String createEmployee(@org.springframework.web.bind.annotation.ModelAttribute(value = "employeeDetails")
com.famstack.projectscheduler.employees.bean.EmployeeDetails employeeDetails, org.springframework.validation.BindingResult result, org.springframework.ui.Model model) {
    famstackDashboardManager.createUser(employeeDetails);
    return "{\"status\": true}";
}