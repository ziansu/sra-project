public static sinlin.string_facade.StringFacadeIF createVCEF(java.lang.String string) {
    java.lang.String clearedString = sinlin.Util.clearSquareBrackets(string);
    if (sinlin.string_facade.CycleString.test(clearedString)) {
        return new sinlin.string_facade.CycleString(string);
    }
    if (sinlin.string_facade.Expr.test(clearedString)) {
        return new sinlin.string_facade.Expr(string);
    }
    if (sinlin.string_facade.VarString.test(clearedString)) {
        return new sinlin.string_facade.VarString(string);
    }
    return new sinlin.string_facade.Fn(string);
}