@org.osgl.mvc.annotation.GetAction(value = "updates")
public final void updateQueries(java.lang.String queries) {
    int q = regulateQueries(queries);
    java.util.List<com.techempower.act.domain.IWorld> retVal = new java.util.ArrayList<>();
    for (int i = 0; i < q; ++i) {
        retVal.add(findAndModifyOne());
    }
    json(retVal);
}