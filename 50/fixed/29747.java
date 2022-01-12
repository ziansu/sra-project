private void generateFunction(java.lang.String name, nez.lang.Expression e) {
    Verbose(e.toString());
    BeginFunc(name);
    {
        initFunc(e);
        visit(e, null);
        Succ();
    }
    EndFunc();
}