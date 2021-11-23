public static controllers.Result tasks() {
    return ok(index.render(controllers.Task.all(), controllers.Application.taskForm));
}