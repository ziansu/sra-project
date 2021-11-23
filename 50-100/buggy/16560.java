public boolean Assign() {
    if (!(Var())) {
        return false;
    }
    token = ls.lex();
    if ((token) != (java.util.Arrays.asList(ls.keywords).indexOf(":="))) {
        return false;
    }
    token = ls.lex();
    if (!(Expr())) {
        java.lang.System.out.println("You are missing expr");
        return false;
    }
    return true;
}