@com.biblioteka.service.RequestMapping(value = "/list", method = RequestMethod.GET, headers = "Accept=application/json", produces = { "application/json" })
@com.biblioteka.service.ResponseBody
public java.util.List<com.biblioteka.model.Employee> employeeList() {
    return employeeDAO.getAllEmployees();
}