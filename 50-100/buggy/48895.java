public void contextsChanged(clojure.lang.IPersistentMap addedcontexts, java.lang.Boolean clear) {
    if (clear) {
        edu.buffalo.cse.sneps3.gui.business.Context.clearContexts();
        for (edu.buffalo.cse.sneps3.gui.business.IView i : views) {
            i.ctUpdate(new java.util.ArrayList<edu.buffalo.cse.sneps3.gui.business.Context>(), true);
        }
        return ;
    }
    java.util.ArrayList<edu.buffalo.cse.sneps3.gui.business.Context> newcts = edu.buffalo.cse.sneps3.gui.business.Context.createContexts(addedcontexts);
    for (edu.buffalo.cse.sneps3.gui.business.IView i : views) {
        i.ctUpdate(newcts, false);
    }
}