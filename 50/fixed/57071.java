@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.DELETE, value = "topics/{topicId}/courses/{id}")
public void DeleteCourse(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.String id) {
    this.courseService.deleteCourse(id);
}