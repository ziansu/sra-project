public play.mvc.Result viewAllPassages() {
    java.lang.Long instId = java.lang.Long.valueOf(session("userId"));
    controllers.User inst = controllers.User.byId(instId);
    java.util.List<controllers.SimplePassage> pList = controllers.SimplePassage.byInstructorId(instId);
    return ok(viewAllPassages.render(pList, inst));
}