@org.springframework.web.bind.annotation.RequestMapping(value = "addComputer", method = org.springframework.web.bind.annotation.RequestMethod.POST)
protected java.lang.String addComputer(@org.springframework.validation.annotation.Validated
com.ebiz.computerdatabase.dto.ComputerDTO computerDTO, org.springframework.validation.BindingResult bindingResult, org.springframework.ui.Model model) {
    model.addAttribute("computer", new com.ebiz.computerdatabase.dto.ComputerDTO());
    if (bindingResult.hasErrors()) {
        return "404";
    }
    computerService.insertComputer(computerDTO);
    model.addAttribute("companyList", companyService.getCompanies());
    return "addComputer";
}