@org.springframework.web.bind.annotation.RequestMapping(value = "/empAdd", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView showAdd(@org.springframework.web.bind.annotation.RequestParam(required = false)
java.lang.Integer id, @org.springframework.web.bind.annotation.RequestParam(required = true)
java.lang.Integer depId) {
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView(evg.testt.util.JspPath.EMPLOYEE_ADD);
    evg.testt.model.Employee addEmployee = new evg.testt.model.Employee();
    try {
        addEmployee = employeeService.getById(id);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    mav.addObject("employee", addEmployee);
    mav.addObject("depId", depId);
    return mav;
}