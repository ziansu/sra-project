private void recursive(japa.parser.ast.Node node) {
    for (japa.parser.ast.Node child : node.getChildrenNodes()) {
        java.lang.System.out.println("---------------------------------------");
        java.lang.System.out.println(java.lang.String.format("%s from %s, %s", child.getClass().getName(), child.getBeginLine(), child.getBeginColumn()));
        java.lang.System.out.println(child);
        recursive(child);
    }
}