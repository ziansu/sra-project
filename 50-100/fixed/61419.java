public static controllers.Result newTask() {
    controllers.Form<controllers.Task> filledForm = controllers.Application.taskForm.bindFromRequest();
    if (filledForm.hasErrors()) {
        return badRequest(index.render(controllers.Task.all(), filledForm));
    }else {
        controllers.Task.create(filledForm.get());
        return redirect(routes.Application.tasks());
    }
}