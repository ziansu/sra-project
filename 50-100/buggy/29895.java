@java.lang.Override
public java.lang.Object visitAny(nez.lang.Nez.Any e, java.lang.Object a) {
    if (strategy.BinaryGrammar) {
        Statement(_Func("move", "1"));
        If(_Func("eof"));
        {
            trace(".");
            Fail();
        }
        EndIf();
    }else {
        If(_Func("read"), _Eq(), "0");
        {
            trace(".");
            Fail();
        }
        EndIf();
    }
    return null;
}