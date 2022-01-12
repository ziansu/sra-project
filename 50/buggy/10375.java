private void checkBinaryEOF(boolean checked) {
    if ((strategy.BinaryGrammar) && checked) {
        If(_Func("eof"));
        {
            trace("B");
            Fail();
        }
        trace("b");
        EndIf();
    }
}