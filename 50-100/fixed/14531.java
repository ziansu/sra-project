private java.lang.Object implicitPropertiesToString(java.util.List<com.ge.research.sadl.model.ConceptName> iprops) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < (iprops.size()); i++) {
        if (i > 0)
            sb.append(", ");
        
        sb.append(getImplicitProperties().get(i).toFQString());
    }
    return sb.toString();
}