@io.khasang.archivarius.controller.GetMapping(value = { "/{id}/edit" })
public java.lang.String departmentForm(@io.khasang.archivarius.controller.PathVariable(value = "id")
java.lang.String id, org.springframework.ui.ModelMap model) {
    io.khasang.archivarius.entity.Department department = departmentService.getDepartmentById(java.lang.Integer.valueOf(id));
    model.addAttribute("companies", companyService.getCompanyList());
    model.addAttribute("department", department);
    return "forms/department";
}