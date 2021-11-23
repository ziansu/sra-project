private void checkContext(ar.fiuba.tdd.template.tp0.tokenizer.Context context) {
    if ((ar.fiuba.tdd.template.tp0.tokenizer.helper.Helper.isEscape(context)) && (!(context.hasNextCharacter()))) {
        throw new ar.fiuba.tdd.template.tp0.exception.IllegalRegexException("Regex can\'t end with \\");
    }
}