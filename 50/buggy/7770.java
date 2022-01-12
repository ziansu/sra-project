public korat.finitization.IFieldDomain createObjSet(korat.finitization.IClassDomain classDomain, boolean includeNull) {
    korat.finitization.IObjSet ret = createObjSet(classDomain.getClassOfObjects());
    ret.addClassDomain(classDomain);
    ret.setNullAllowed(true);
    return ret;
}