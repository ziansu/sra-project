@com.inva.hipstertest.freemarker.controllers.RequestMapping(value = "/freemarker/teacher-mgmt/teacher-mgmt-create", method = RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView teacherManagementCreate(@com.inva.hipstertest.freemarker.controllers.ModelAttribute(value = "model")
org.springframework.ui.ModelMap model) {
    com.inva.hipstertest.service.dto.TeacherDTO teacherDTO = new com.inva.hipstertest.service.dto.TeacherDTO();
    com.inva.hipstertest.service.dto.TeacherDTO currentUser = teacherService.findTeacherByCurrentUser();
    java.lang.Boolean schoolEnabled = schoolService.getSchoolStatus(currentUser.getSchoolId());
    if (!schoolEnabled) {
        model.addAttribute("currentUser", currentUser);
        return new org.springframework.web.servlet.ModelAndView("schoolDisabledPage");
    }
    return new org.springframework.web.servlet.ModelAndView("teacher-mgmt/teacher-mgmt-create", "teacherDTO", teacherDTO);
}