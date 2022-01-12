@java.lang.Override
edu.umn.biomedicus.framework.SearchExpr.State search(edu.umn.biomedicus.framework.SearchExpr.DefaultSearcher search, edu.umn.biomedicus.framework.SearchExpr.State state) {
    edu.umn.biomedicus.framework.SearchExpr.State res = condition.search(search, state.copy());
    if (res.isMiss()) {
        return res;
    }
    return next.search(search, state);
}