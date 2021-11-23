private static void consumeToEndOfToken68BasedChallenge(com.albroco.barebonesdigest.Rfc2616AbnfParser parser) throws Rfc2616AbnfParser.ParseException {
    parser.consumeToken68().consumeWhitespace();
    if (parser.hasMoreData()) {
        int pos = parser.getPos();
        parser.consumeLiteral(",").setPos(pos);
    }
}