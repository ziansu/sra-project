public void validate(org.zkoss.bind.ValidationContext ctx) {
    int tagsCount = 6;
    java.lang.String message = ((java.lang.String) (ctx.getBindContext().getValidatorArg("message")));
    java.lang.String tags = ((java.lang.String) (ctx.getProperty().getValue()));
    if (!(tags.matches((("^$|^\\s*[\\w]+(\\s*,\\s*[\\w]+){0," + (tagsCount - 1)) + "}$")))) {
        this.addInvalidMessage(ctx, message);
    }
}