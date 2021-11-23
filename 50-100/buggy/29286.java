@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
protected java.lang.String doPost(@javax.validation.Valid
@org.springframework.web.bind.annotation.ModelAttribute(value = "editComputer")
com.excilys.cdb.controller.dto.ComputerDTO computerDTO, final org.springframework.validation.BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
        com.excilys.cdb.controller.EditComputer.logger.error("DTO Valdation failed !");
    }else {
        com.excilys.cdb.model.Computer computer = dtoMapper.toComputer(computerDTO, companyService);
        if (computer != null) {
            computerService.updateComputer(computer);
        }
    }
    return "redirect:dashboard";
}