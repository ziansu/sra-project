@java.lang.Override
public java.lang.Boolean supports(ar.fiuba.tdd.template.tp0.tokenizer.Context context) {
    return (isLiteral(context)) || (isEscape(context));
}