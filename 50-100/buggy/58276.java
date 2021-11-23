private tablesaw.DependencyAnnotations createDependencyAnnotations(java.lang.Class ruleClass) {
    tablesaw.DependencyAnnotations da = new tablesaw.DependencyAnnotations();
    for (java.lang.reflect.Method m : ruleClass.getMethods()) {
        tablesaw.annotation.Consumes consumes = m.getAnnotation(tablesaw.annotation.Consumes.class);
        if (consumes != null) {
            da.addConsumesMethod(consumes.value(), m);
        }else {
            tablesaw.annotation.Provides provides = m.getAnnotation(tablesaw.annotation.Provides.class);
            if (provides != null) {
                da.addProvidesMethod(provides.value(), m);
            }
        }
    }
    return da;
}