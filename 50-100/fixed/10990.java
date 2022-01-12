protected void generateStaticKeyFunctionForRole(pt.ist.fenixframework.dml.Role role, java.io.PrintWriter out) {
    if ((role.getMultiplicityUpper()) != 1) {
        println(out, generateMapKeyFunction(role.getName(), role.getType().getFullName(), "Comparable<?>", "Oid", false));
    }
}