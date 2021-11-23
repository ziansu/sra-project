@autumn.annotation.GET(value = "/lectures/:lectureId")
public static autumn.Result getLectureView(autumn.Request req, @autumn.annotation.INP(value = "lectureId")
java.lang.String lectureId) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
    java.lang.reflect.Method method = controllers.LectureController.getController(req).getMethod("viewLecture", req.getClass(), lectureId.getClass());
    return ((autumn.Result) (method.invoke(null, req, lectureId)));
}