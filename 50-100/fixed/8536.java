@java.lang.Override
public java.lang.String toStrRepresentation() {
    java.lang.String result = "";
    java.util.List<java.lang.String> sub_strs = new java.util.ArrayList<>();
    for (org.tariel.pla.logics.IFunction sub : this.getSub()) {
        if (sub != null)
            sub_strs.add(sub.toStrRepresentation());
        
    }
    result = java.lang.String.join(" ⋀ ", sub_strs);
    return result;
}