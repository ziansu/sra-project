@java.lang.SuppressWarnings(value = "rawtypes")
public java.util.List<java.lang.Class> getUserConfigTypes() {
    java.util.List<java.lang.Class> params = super.getUserConfigTypes();
    params.add(java.lang.Integer.class);
    params.add(org.biojava.nbio.structure.align.symm.CESymmParameters.SymmetryType.class);
    params.add(org.biojava.nbio.structure.align.symm.CESymmParameters.OrderDetectorMethod.class);
    params.add(org.biojava.nbio.structure.align.symm.CESymmParameters.RefineMethod.class);
    params.add(java.lang.Boolean.class);
    params.add(java.lang.Long.class);
    return params;
}