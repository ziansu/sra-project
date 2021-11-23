@org.personalized.dashboard.controller.DELETE
@org.personalized.dashboard.controller.Path(value = "{todoId}")
public org.personalized.dashboard.controller.Response deleteTodo(@org.personalized.dashboard.controller.Context
org.personalized.dashboard.controller.HttpHeaders httpHeaders, @org.personalized.dashboard.controller.PathParam(value = "todoId")
java.lang.String todoId) {
    try {
        if (org.apache.commons.lang3.StringUtils.isEmpty(todoId)) {
            return org.personalized.dashboard.controller.Response.status(Response.Status.BAD_REQUEST).build();
        }else {
            todoService.deleteTodo(todoId);
            return org.personalized.dashboard.controller.Response.status(Response.Status.OK).build();
        }
    } catch (java.lang.Exception e) {
        LOGGER.error("TodoController encountered an error", e);
        return org.personalized.dashboard.controller.Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
    }
}