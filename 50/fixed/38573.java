private void write(wyil.lang.Codes.AssertOrAssume o) throws java.lang.Exception {
    for (wyil.lang.Code c : o.bytecodes()) {
        write(c);
    }
}