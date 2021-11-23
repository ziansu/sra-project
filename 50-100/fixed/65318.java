@org.springframework.web.bind.annotation.RequestMapping(value = "/vacancy/{id}")
public org.springframework.web.servlet.ModelAndView showVacancyInfoPage(@org.springframework.web.bind.annotation.PathVariable(value = "id")
int id, java.security.Principal principal) {
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView("vacancy");
    ua.com.jobsukraine.entity.Vacancy vacancy = vs.find(id);
    mav.addObject("sameEmployer", vacancy.getEmployer().getInfo().getLogin().equals(principal.getName()));
    mav.addObject("vacancy", vacancy);
    return mav;
}