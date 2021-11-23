public static controllers.Result deleteRateCriterion(java.lang.Long id) {
    controllers.RateCriterion rateCs = controllers.RateCriterion.findById(id);
    if (rateCs != null) {
        rateCs.delete();
    }
    return redirect(((routes.AdminPage.index()) + "#criterions"));
}