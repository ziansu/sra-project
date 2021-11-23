public static controllers.Result tasks() {
    return ok(views.html.index.render(controllers.Task.all(), controllers.Application.taskForm));
}