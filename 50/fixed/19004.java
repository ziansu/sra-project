@org.springframework.web.bind.annotation.RequestMapping(value = { "/checkings_or_savings" }, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String checkingOrSavingsSubmit(@org.springframework.web.bind.annotation.ModelAttribute
edu.umsl.sunnyDaysATM.domain.AccountChoice accountChoice, org.springframework.ui.Model model) {
    model.addAttribute("accountChoice", accountChoice);
    return "signin";
}