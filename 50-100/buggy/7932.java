@org.springframework.web.bind.annotation.RequestMapping(value = "/filterExercise", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String filterExercise(org.springframework.ui.Model model, java.lang.String title, java.lang.String label) {
    if ((title.equals("0")) || (title.equals("1"))) {
        model.addAttribute("exercises", em.filterExercise(label, label, title, label));
    }else {
        model.addAttribute("exercises", em.filterExercise(label, label, label, title));
    }
    return "listExercises";
}