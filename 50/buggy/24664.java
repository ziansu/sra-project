public static controllers.Result index() {
    return ok(projectlist.render("Project List", Project.find.all()));
}