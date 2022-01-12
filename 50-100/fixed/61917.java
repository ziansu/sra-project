public static void cond(kNode c) {
    kNode ifelse = c.child;
    kNode ifstmt = ifelse.next.next;
    Interpreter.exprt(ifstmt);
    ifstmt.token.value = java.lang.Boolean.toString(Interpreter.cond);
    if ((ifstmt.token.value) == "true") {
        Interpreter.stmt_list(ifstmt.next.next.next);
    }else
        if (((ifstmt.next.next.next.next.next) != null) && ((ifstmt.token.value) == "false")) {
            kNode elsestmt = ifstmt.next.next.next.next.next;
            Interpreter.stmt_list(elsestmt.next.next);
        }
    
}