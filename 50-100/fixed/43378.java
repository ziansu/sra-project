public static java.lang.String readExpression() {
    java.lang.String exp = "";
    int openParens = 0;
    java.lang.String line = "";
    while (true) {
        if ("".equals(exp))
            line = com.diylisp.Repl.readLine("→  ");
        else
            line = com.diylisp.Repl.readLine("…  ");
        
        openParens += com.diylisp.Repl.countOpenParens(line);
        exp += line;
        if (openParens <= 0)
            break;
        
    } 
    return exp;
}