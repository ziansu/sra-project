public void contextsChanged(clojure.lang.IPersistentMap addedcontexts, java.lang.Boolean clear) {
    if (clear) {
        edu.buffalo.cse.sneps3.gui.business.Context.clearContexts();
    }
    java.util.ArrayList<edu.buffalo.cse.sneps3.gui.business.Context> newcts = edu.buffalo.cse.sneps3.gui.business.Context.createContexts(addedcontexts);
    for (edu.buffalo.cse.sneps3.gui.business.IView i : views) {
        i.ctUpdate(newcts, clear);
    }
}