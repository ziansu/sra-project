@autumn.annotation.GET(value = "/lectures")
public static autumn.Result getLectureList(autumn.Request req) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
    java.lang.reflect.Method method = controllers.LectureController.getController(req).getMethod("listLecture", req.getClass());
    return ((autumn.Result) (method.invoke(null, new java.lang.Object[]{ req })));
}