@org.springframework.web.bind.annotation.RequestMapping(value = "/DepartmentsCassandra/edit", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.transaction.annotation.Transactional(readOnly = false)
public org.springframework.web.servlet.ModelAndView update(@org.springframework.web.bind.annotation.RequestParam(value = "department_id")
int department_id, @org.springframework.web.bind.annotation.RequestParam(value = "department_name")
java.lang.String department_name, org.springframework.web.servlet.ModelAndView mav) {
    java.lang.System.out.println(("変更後部署名：" + department_name));
    com.example.cassandra.entity.Departments mydata = repository.findByDepartmentId(department_id);
    mydata.setDepartment_name(department_name);
    mydata.setDepartment_id(department_id);
    repository.save(mydata);
    mav.addObject("formModel", null);
    return new org.springframework.web.servlet.ModelAndView("redirect:/DepartmentsCassandra");
}