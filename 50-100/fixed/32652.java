public static play.mvc.Result problemListPage() {
    java.util.List<models.Problem> problems = Problem.find.where().or(com.avaje.ebean.Expr.eq("status", 0), com.avaje.ebean.Expr.eq("status", 3)).findList();
    return ok(views.html.problem.list.render(problems, null));
}