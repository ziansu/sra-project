private void generateFunction(java.lang.String name, nez.lang.Expression e) {
    BeginFunc(name);
    {
        Verbose(e.toString());
        initFunc(e);
        visit(e, null);
        Succ();
    }
    EndFunc();
}