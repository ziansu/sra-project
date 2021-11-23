@ua.nc.controller.RequestMapping(value = { "/students/list/{itemsPerPage}/{pageNumber}" }, method = RequestMethod.GET, produces = "application/json")
@ua.nc.controller.ResponseBody
public ua.nc.entity.profile.StudentData getStudents(@ua.nc.controller.PathVariable(value = "itemsPerPage")
java.lang.Integer itemsPerPage, @ua.nc.controller.PathVariable(value = "pageNumber")
java.lang.Integer pageNumber) {
    ua.nc.entity.profile.StudentData studentData;
    ua.nc.service.StudentService studentService = new ua.nc.service.StudentServiceImpl();
    studentData = studentService.getStudents(itemsPerPage, pageNumber);
    if (studentData == null) {
        ua.nc.controller.AdminController.LOGGER.warn("studData == null");
    }
    return studentData;
}