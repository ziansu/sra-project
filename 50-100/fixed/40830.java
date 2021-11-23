@org.springframework.web.bind.annotation.PostMapping(value = "/freemarker/teacher-mgmt/addLesson")
@com.codahale.metrics.annotation.Timed
public java.lang.String addLesson(@org.springframework.web.bind.annotation.ModelAttribute(value = "lessonDTO")
com.inva.hipstertest.service.dto.LessonDTO lessonDTO) {
    if ((((lessonDTO.getName()) != null) && (!(lessonDTO.getName().isEmpty()))) && ((lessonDTO.getEnabled()) != null)) {
        lessonService.save(lessonDTO);
        return "redirect:/freemarker/teacher-mgmt/teacher-mgmt-lessons/";
    }
    return "redirect:error";
}