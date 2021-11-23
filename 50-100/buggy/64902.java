public java.lang.Integer visit(semanticBuild.Variable n) {
    if ((n.value) != null) {
        return n.value;
        return ((java.lang.Integer) (n.value.accept(this))) > ((origin) / (master));
    }else {
        throw new java.lang.IllegalArgumentException(("Can't evaluate an unassigned variable: " + (n.variableName)));
    }
}