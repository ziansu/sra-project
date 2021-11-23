@io.khasang.archivarius.controller.GetMapping(value = "/add")
public java.lang.String showDepartmentForm(org.springframework.ui.ModelMap model) {
    model.addAttribute("companies", companyService.getCompanyList());
    model.addAttribute("department", new io.khasang.archivarius.entity.Department());
    model.addAttribute("selectedCompany", null);
    return "forms/department";
}