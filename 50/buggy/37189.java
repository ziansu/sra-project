@ua.com.controllers.RequestMapping(value = "/delete", method = RequestMethod.POST, consumes = "application/json")
public void delete(@ua.com.controllers.RequestBody
ua.com.model.Department department) {
    departmentService.delete(department);
}