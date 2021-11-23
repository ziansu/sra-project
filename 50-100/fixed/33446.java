@org.springframework.web.bind.annotation.RequestMapping(value = "addComputerForm", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String addComputerView(org.springframework.ui.ModelMap model) throws java.io.IOException {
    com.excilys.service.CompanyService workCompt = new com.excilys.service.CompanyService();
    java.util.List<com.excilys.model.Company> companies = workCompt.getCompanies();
    model.addAttribute("companies", companies);
    model.addAttribute("added", 2);
    return "addComputer";
}