@fr.real.english.lessons.controllers.RequestMapping(value = "api/lessons-link/{userId}/{lessonId}", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity linkStudentToLesson(@fr.real.english.lessons.controllers.PathVariable(value = "lessonId")
java.lang.Long lessonId, @fr.real.english.lessons.controllers.PathVariable(value = "userId")
java.lang.Long userId) {
    fr.real.english.users.models.Account student = accountRepository.findOne(userId);
    fr.real.english.lessons.models.Lesson lesson = lessonRepository.findOne(lessonId);
    lesson.addStudent(student);
    lessonRepository.save(lesson);
    accountRepository.save(student);
    return new org.springframework.http.ResponseEntity(lesson, org.springframework.http.HttpStatus.OK);
}