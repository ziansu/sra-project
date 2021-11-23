@org.springframework.web.bind.annotation.GetMapping(value = "/")
public java.lang.String index(org.springframework.ui.Model model) {
    model.addAttribute("issueList", issueRepository.findAll());
    return "index";
}