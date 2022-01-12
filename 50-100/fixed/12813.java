private org.esa.snap.core.datamodel.Band getComplexSrcBand(final org.esa.snap.core.datamodel.Band iBand) {
    java.lang.String name = iBand.getName();
    if (name.startsWith("i_")) {
        name = name.replace("i_", "q_");
    }else
        if (name.startsWith("q_")) {
            name = name.replace("q_", "i_");
        }
    
    return srcProduct.getBand(name);
}