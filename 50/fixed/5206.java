public void printAll() {
    for (Quad q : Quad.getAll()) {
        java.lang.System.out.println(q.fullExpr());
    }
}