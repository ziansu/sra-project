@org.springframework.web.bind.annotation.RequestMapping(value = "createmulti")
public org.springframework.web.servlet.ModelAndView showCreateMultiChoice(org.springframework.web.servlet.ModelAndView mav) {
    springmvc.domain.MultiChoice game = new springmvc.domain.MultiChoice();
    java.util.ArrayList<springmvc.domain.Exercise> exercises = new java.util.ArrayList<>();
    springmvc.domain.Exercise e = new springmvc.domain.Exercise();
    springmvc.domain.CreateMultiExercise ce = new springmvc.domain.CreateMultiExercise();
    mav.addObject("MultiGame", game);
    mav.addObject("Exercises", exercises);
    mav.addObject("Exercise", e);
    int n = 0;
    mav.addObject("createExercise", ce);
    mav.setViewName("createmulti");
    return mav;
}