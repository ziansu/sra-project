private void checkContext(ar.fiuba.tdd.template.tp0.tokenizer.Context context) {
    if ((isEscape(context)) && (!(context.hasNextCharacter()))) {
        throw new ar.fiuba.tdd.template.tp0.exception.IllegalRegexException("Regex can\'t end with \\");
    }
}