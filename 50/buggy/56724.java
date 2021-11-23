@java.lang.Override
public void genC(ast.PW pw, boolean putParenthesis) {
    pw.print((value ? "1" : "0"));
}