public void caseframesChanged(clojure.lang.APersistentSet addedcfs, java.lang.Boolean clear) {
    if (clear) {
        edu.buffalo.cse.sneps3.gui.business.Caseframe.clearCaseframes();
        for (edu.buffalo.cse.sneps3.gui.business.IView i : views) {
            i.cfUpdate(new java.util.ArrayList<edu.buffalo.cse.sneps3.gui.business.Caseframe>(), true);
        }
        return ;
    }
    java.util.ArrayList<edu.buffalo.cse.sneps3.gui.business.Caseframe> c = edu.buffalo.cse.sneps3.gui.business.Caseframe.createCaseframes(addedcfs);
    for (edu.buffalo.cse.sneps3.gui.business.IView i : views) {
        i.cfUpdate(c, false);
    }
}