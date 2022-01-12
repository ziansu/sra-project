private java.lang.Boolean assertion(com.inovia.magnifier.database.FunctionParameter p) {
    return (((p.getName()) != null) && (!(p.getName().isEmpty()))) && (p.getName().toLowerCase().endsWith(("_" + (p.getMode().toLowerCase()))));
}