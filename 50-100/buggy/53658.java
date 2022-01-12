@java.lang.Override
public com.inva.hipstertest.service.dto.LessonDTO save(com.inva.hipstertest.service.dto.LessonDTO lessonDTO) {
    log.debug("Request to save Lesson : {}", lessonDTO);
    java.lang.System.out.println("2");
    com.inva.hipstertest.domain.Lesson lesson = lessonMapper.lessonDTOToLesson(lessonDTO);
    java.lang.System.out.println("3");
    lesson = lessonRepository.save(lesson);
    java.lang.System.out.println("4");
    com.inva.hipstertest.service.dto.LessonDTO result = lessonMapper.lessonToLessonDTO(lesson);
    return result;
}