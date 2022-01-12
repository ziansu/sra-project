@org.springframework.web.bind.annotation.RequestMapping(value = "/add", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String saveAssignment(@javax.validation.Valid
@org.springframework.web.bind.annotation.ModelAttribute(value = "newAssignment")
trioz.project.domain.Assignment assignment, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes, org.springframework.ui.Model model, org.springframework.validation.BindingResult bindResult) {
    java.lang.System.out.println("here");
    model.addAttribute(assignment);
    if (bindResult.hasErrors()) {
        java.lang.System.out.println(("Size:" + (bindResult.getErrorCount())));
        return "addAssignment";
    }
    assignmentService.save(assignment);
    redirectAttributes.addFlashAttribute("assignment", assignment);
    model.addAttribute("assignment", assignment);
    return "redirect:/assignment/show";
}