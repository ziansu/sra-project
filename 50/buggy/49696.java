@org.springframework.web.bind.annotation.RequestMapping(value = "createmulti", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView showCreateMultiChoice(org.springframework.web.servlet.ModelAndView mav, @org.springframework.web.bind.annotation.ModelAttribute(value = "Exercises")
java.util.ArrayList<springmvc.domain.Exercise> exercises, @org.springframework.web.bind.annotation.ModelAttribute(value = "Exercise")
springmvc.domain.Exercise e, @org.springframework.web.bind.annotation.ModelAttribute(value = "createExercise")
springmvc.domain.CreateMultiExercise ce) {
    java.lang.System.out.println("kommer ifaosjifdsa");
    mav.setViewName("createmulti");
    return mav;
}