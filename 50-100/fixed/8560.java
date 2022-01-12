@com.banner.bannerApplication.controllers.RequestMapping(method = RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView AddSection(@com.banner.bannerApplication.controllers.RequestParam
long courseID, @com.banner.bannerApplication.controllers.RequestParam
java.lang.String ProfessorFirstname, @com.banner.bannerApplication.controllers.RequestParam
java.lang.String ProfessorLastname, @com.banner.bannerApplication.controllers.RequestParam
int sectionnumber) {
    com.banner.bannerApplication.entities.Course course = courseRepository.findOne(courseID);
    com.banner.bannerApplication.entities.Section n = new com.banner.bannerApplication.entities.Section();
    n.setFirstName(ProfessorFirstname);
    n.setLastName(ProfessorLastname);
    n.setSectionNumber(sectionnumber);
    sectionRepository.save(n);
    return new org.springframework.web.servlet.ModelAndView("redirect:/section");
}