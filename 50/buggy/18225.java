@com.semvalidator.controllers.RequestMapping(value = "/questions/add", method = RequestMethod.GET)
public java.lang.String showAddForm(org.springframework.ui.Model model) {
    com.semvalidator.model.Question question = new com.semvalidator.model.Question();
    model.addAttribute("question", question);
    model.addAttribute("criterions", criterionService.findAll());
    return "questions/form";
}