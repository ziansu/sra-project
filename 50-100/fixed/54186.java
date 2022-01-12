@java.lang.Override
public java.lang.Object visitOption(nez.lang.Nez.Option e, java.lang.Object a) {
    nez.lang.Expression sub = e.get(0);
    if (!(tryOptionOptimization(sub))) {
        java.lang.String f = _eval(sub);
        java.lang.String[] n = SaveState(sub);
        Verbose(sub.toString());
        If(_Not(f));
        {
            BackState(sub, n);
        }
        EndIf();
    }
    return null;
}