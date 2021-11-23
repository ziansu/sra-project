@java.lang.Override
public java.lang.String toLaTeXString(boolean symbolic) {
    if (isDefined()) {
        return fun.toLaTeXString(symbolic);
    }
    return app.getPlain("undefined");
}