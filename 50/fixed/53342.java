private boolean isGeneratedProcedure(exc.xmpF.XobjectDef d) {
    java.lang.String name = d.getName();
    if ((name != null) && (name.startsWith("xmpf_traverse_")))
        return true;
    
    return false;
}