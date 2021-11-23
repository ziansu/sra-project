public static controllers.Result deleteRateCriterion(java.lang.Long id) {
    java.util.List<controllers.RateCriterion> rateCs = controllers.RateCriterion.findById(id);
    for (controllers.RateCriterion rateC : rateCs) {
        rateC.delete();
    }
    return redirect(((routes.AdminPage.index()) + "#criterions"));
}