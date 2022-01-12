@java.lang.Override
public java.lang.Object visitByte(nez.lang.Nez.Byte e, java.lang.Object a) {
    If(_Func("read"), _NotEq(), _byte(e.byteChar));
    {
        Fail();
    }
    EndIf();
    checkBinaryEOF(((e.byteChar) == 0));
    return null;
}