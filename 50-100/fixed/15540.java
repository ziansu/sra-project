public void printArguments(java.util.List<pj.parser.ast.expr.Expression> args, java.lang.Object arg) {
    printer.print("(");
    if (args != null) {
        for (java.util.Iterator<pj.parser.ast.expr.Expression> i = args.iterator(); i.hasNext();) {
            pj.parser.ast.expr.Expression e = i.next();
            e.accept(this, arg);
            if (i.hasNext()) {
                printer.print(", ");
            }
        }
    }
    printer.print(")");
}