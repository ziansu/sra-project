private void checkBinaryEOF(boolean checked) {
    if ((strategy.BinaryGrammar) && checked) {
        If(_Func("eof"));
        {
            Fail();
        }
        EndIf();
    }
}