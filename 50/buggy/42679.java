@java.lang.Override
public java.lang.Boolean supports(ar.fiuba.tdd.template.tp0.tokenizer.Context context) {
    return (ar.fiuba.tdd.template.tp0.tokenizer.helper.Helper.isLiteral(context)) || (ar.fiuba.tdd.template.tp0.tokenizer.helper.Helper.isEscape(context));
}