protected void generateStaticKeyFunctionForRole(pt.ist.fenixframework.dml.Role role, java.io.PrintWriter out) {
    if ((role.getMultiplicityUpper()) == (Role.MULTIPLICITY_MANY)) {
        println(out, generateMapKeyFunction(role.getName(), role.getType().getFullName(), "Comparable<?>", "Oid", false));
    }
}