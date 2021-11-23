@java.lang.Override
public vct.antlr4.parser.OMPelement visitOmp_pragma(vct.antlr4.parser.Omp_pragmaContext ctx) {
    java.lang.System.err.printf("pragma %s%n", ctx.toStringTree());
    return ctx.getChild(0).accept(this);
}