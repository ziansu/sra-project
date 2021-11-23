@org.springframework.web.bind.annotation.RequestMapping(value = "create")
public org.springframework.web.servlet.ModelAndView create(@org.springframework.web.bind.annotation.RequestParam
java.lang.String deptName, java.lang.String location) throws java.lang.Exception {
    final java.lang.String METHOD_NAME = "create";
    log.debug((METHOD_NAME + " begin"));
    org.springframework.web.servlet.ModelAndView mav = null;
    com.pactera.web.model.Department dept = new com.pactera.web.model.Department();
    dept.setDeptName(deptName);
    dept.setLocation(location);
    departmentService.save(dept);
    mav = new org.springframework.web.servlet.ModelAndView("redirect:list");
    log.debug((METHOD_NAME + " end"));
    return mav;
}