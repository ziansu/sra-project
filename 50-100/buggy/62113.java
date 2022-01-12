public static org.monospark.spongematchers.parser.element.StringElement parseStringElement(java.lang.String string) throws org.monospark.spongematchers.parser.SpongeMatcherParseException {
    org.monospark.spongematchers.parser.element.StringElementContext context = new org.monospark.spongematchers.parser.element.StringElementContext(string);
    org.monospark.spongematchers.parser.element.StringElementParser.BASE_ELEMENT_PARSERS.forEach(( p) -> p.parseElements(context));
    java.lang.String lastContextString;
    do {
        lastContextString = context.getString();
        org.monospark.spongematchers.parser.element.StringElementParser.OTHER_ELEMENT_PARSERS.forEach(( p) -> p.parseElements(context));
    } while (!(lastContextString.equals(context.getString())) );
    return context.getFinalElement();
}