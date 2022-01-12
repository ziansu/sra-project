@java.lang.Override
public semantic.Value visitSentencia_imprimir(grammar.LITEParser.Sentencia_imprimirContext ctx) {
    semantic.Value valor = this.visit(ctx.expresion());
    salida = salida.concat(((valor.toString()) + "\n"));
    java.lang.System.out.println(valor);
    return Value.VOID;
}