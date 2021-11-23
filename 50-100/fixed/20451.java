@org.springframework.web.bind.annotation.RequestMapping(value = "/insurance/{insuranceCode}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String showOneInsurance(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.PathVariable
int insuranceCode) {
    model.addAttribute("insurance", insuranceRepository.findOneInsurance(insuranceCode));
    model.addAttribute("clients", clientRepository.findClientWithInsuranceCode(insuranceCode));
    model.addAttribute("classActiveInsurance", "active");
    return "views/insurance/read";
}