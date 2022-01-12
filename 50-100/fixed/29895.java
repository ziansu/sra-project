@java.lang.Override
public java.lang.Object visitAny(nez.lang.Nez.Any e, java.lang.Object a) {
    if (strategy.BinaryGrammar) {
        Statement(_Func("move", "1"));
        If(_Func("eof"));
        {
            Fail();
        }
        EndIf();
    }else {
        If(_Func("read"), _Eq(), "0");
        {
            Fail();
        }
        EndIf();
    }
    return null;
}