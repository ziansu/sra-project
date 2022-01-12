private static java.lang.String getImports() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("import org.junit.Test;\n");
    sb.append("import org.junit.Before;\n");
    sb.append("import org.junit.Assert;\n");
    for (java.lang.String imp : main.MakeTests.imports) {
        if (main.MakeTests.isValidClass(imp)) {
            sb.append((("import " + imp) + ";\n"));
        }
    }
    return sb.toString();
}