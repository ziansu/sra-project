@java.lang.Override
protected java.lang.String load() {
    double sum = 0;
    for (org.apache.wicket.model.IModel<de.master.manager.profStuff.Prof> p : java.util.Arrays.asList(profs)) {
        sum += calculate.apply(p.getObject());
    }
    return (sum + " von ") + (maxPoints.getObject());
}