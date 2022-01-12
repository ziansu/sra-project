@org.springframework.web.bind.annotation.RequestMapping(value = "/EmployeesCassandra/edit", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.transaction.annotation.Transactional(readOnly = false)
public org.springframework.web.servlet.ModelAndView update(@org.springframework.web.bind.annotation.RequestParam(value = "employee_id")
int employee_id, @org.springframework.web.bind.annotation.RequestParam(value = "employee_name")
java.lang.String employee_name, @org.springframework.web.bind.annotation.RequestParam(value = "employee_phone")
java.lang.String employee_phone, @org.springframework.web.bind.annotation.RequestParam(value = "employee_email")
java.lang.String employee_email, org.springframework.web.servlet.ModelAndView mav) {
    java.lang.System.out.println(("変更後社員名：" + employee_name));
    com.example.cassandra.entity.Employees mydata = repository.findByEmployeeId(employee_id);
    mydata.setEmployee_name(employee_name);
    mydata.setEmployee_id(employee_id);
    mydata.setEmployee_phone(employee_phone);
    mydata.setEmployee_email(employee_email);
    repository.save(mydata);
    mav.addObject("formModel", null);
    return new org.springframework.web.servlet.ModelAndView("redirect:/EmployeesCassandra");
}