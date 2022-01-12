@org.springframework.web.bind.annotation.RequestMapping(value = "/employeeEdit", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView updateOne(@org.springframework.web.bind.annotation.RequestParam(required = false)
java.lang.Integer department_id, @org.springframework.web.bind.annotation.RequestParam(required = false)
java.lang.Integer id) throws java.sql.SQLException {
    org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView(evg.testt.util.JspPath.EMPLOYEE_EDIT);
    evg.testt.model.Employee employee;
    if (id != null) {
        employee = employeeService.getById(id);
    }else {
        evg.testt.model.Department department = departmentService.getById(department_id);
        employee = evg.testt.model.Employee.newBuilder().setDepartment(department).build();
    }
    modelAndView.addObject("employee", employee);
    return modelAndView;
}