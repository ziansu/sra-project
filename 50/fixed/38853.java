@java.lang.Override
public java.lang.String visitLiteral_character(Literal_characterContext ctx) {
    char character = ctx.LITERALCHARACTER().getText().charAt(1);
    return addCommand(("ldc " + ((int) (character))));
}