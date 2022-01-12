public static sinlin.string_facade.StringFacadeIF createVCEF(java.lang.String string) {
    assert !(string.contains(StringFacadeIF.DELIM));
    java.lang.String clearedString = sinlin.string_facade.StringFacadeBuilder.clearSquareBrackets(string);
    if (clearedString.contains(StringFacadeIF.DELIM_CYCLE)) {
        return new sinlin.string_facade.CycleString(string);
    }
    if (clearedString.matches(sinlin.string_facade.StringFacadeBuilder.OPERATORS)) {
        return new sinlin.string_facade.Expr(string);
    }
    if (clearedString.contains(StringFacadeIF.DELIM_VAR)) {
        return new sinlin.string_facade.VarString(string);
    }
    return new sinlin.string_facade.Fn(string);
}