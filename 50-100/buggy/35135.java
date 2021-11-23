@org.ednovo.gooru.core.security.AuthorizeOperations(operations = { org.ednovo.gooru.core.constant.GooruOperationConstants.OPERATION_SCOLLECTION_MOVE })
@org.springframework.web.bind.annotation.RequestMapping(value = { org.ednovo.gooru.core.api.model.RequestMappingUri.TARGET_LESSON }, method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public void moveCollection(@org.springframework.web.bind.annotation.PathVariable(value = COURSE_ID)
final java.lang.String courseId, @org.springframework.web.bind.annotation.PathVariable(value = UNIT_ID)
final java.lang.String unitId, @org.springframework.web.bind.annotation.PathVariable(value = LESSON_ID)
final java.lang.String lessonId, @org.springframework.web.bind.annotation.PathVariable(value = ID)
final java.lang.String collectionId, final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response) {
    final org.ednovo.gooru.core.api.model.User user = ((org.ednovo.gooru.core.api.model.User) (request.getAttribute(Constants.USER)));
    this.getCollectionBoService().moveCollection(courseId, unitId, lessonId, collectionId, user);
}