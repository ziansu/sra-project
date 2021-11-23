@java.lang.Override
protected void doSearch(jdepend.model.result.AnalysisResult result) throws jdepend.framework.exception.JDependException {
    jdepend.util.analyzer.element.helper.ServiceOrVO sov;
    for (jdepend.model.JavaClass javaClass : result.getClasses()) {
        if (!(javaClass.isInner())) {
            continue;
        }
        sov = researchServiceOrVO(javaClass);
        this.printTable("类名", javaClass.getName());
        this.printTable("类型", ((sov.getType()) + (sov.getIndex())));
    }
}