@java.lang.Override
public com.inva.hipstertest.service.dto.LessonDTO save(com.inva.hipstertest.service.dto.LessonDTO lessonDTO) {
    log.debug("Request to save Lesson : {}", lessonDTO);
    com.inva.hipstertest.domain.Lesson lesson = lessonMapper.lessonDTOToLesson(lessonDTO);
    lesson = lessonRepository.save(lesson);
    com.inva.hipstertest.service.dto.LessonDTO result = lessonMapper.lessonToLessonDTO(lesson);
    return result;
}