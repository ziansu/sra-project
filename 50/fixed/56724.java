@java.lang.Override
public void genC(ast.PW pw, boolean putParenthesis) {
    pw.print((value ? "true" : "false"));
}