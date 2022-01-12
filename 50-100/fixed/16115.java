@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
protected java.lang.String get(@org.springframework.web.bind.annotation.RequestParam(value = fr.ebiz.computerDatabase.contoller.EditComputerServlet.ID)
java.lang.String idComputer, org.springframework.ui.ModelMap model) throws fr.ebiz.computerDatabase.exception.ServiceException {
    fr.ebiz.computerDatabase.dto.ComputerDTO compDTO;
    compDTO = computerService.showDetailsComputer(java.lang.Long.parseLong(idComputer));
    java.lang.System.err.println(compDTO);
    model.addAttribute(fr.ebiz.computerDatabase.contoller.EditComputerServlet.COMPUTERDB, compDTO);
    java.util.List<fr.ebiz.computerDatabase.dto.CompanyDTO> company = companyService.getAllCompany();
    model.addAttribute(fr.ebiz.computerDatabase.contoller.EditComputerServlet.COMPANY, company);
    return fr.ebiz.computerDatabase.contoller.EditComputerServlet.EDIT_VIEW;
}