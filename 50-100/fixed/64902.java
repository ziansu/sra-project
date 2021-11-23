public java.lang.Integer visit(semanticBuild.Variable n) {
    if ((n.value) != null) {
        return ((java.lang.Integer) (n.value.accept(this)));
    }else {
        throw new java.lang.IllegalArgumentException(("Can't evaluate an unassigned variable: " + (n.variableName)));
    }
}