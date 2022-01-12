@org.springframework.web.bind.annotation.RequestMapping(params = "name")
public java.lang.String findEmployeeByName(@org.springframework.web.bind.annotation.RequestParam(value = "name")
java.lang.String name, java.util.Map<java.lang.String, java.lang.Object> model) {
    java.util.List<victor.training.spring.model.Employee> employeeList = service.findEmployeesByName(name);
    model.put("employeeList", employeeList);
    return "employeeList";
}