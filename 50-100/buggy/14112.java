private static void consumeToEndOfToken68BasedChallenge(com.albroco.barebonesdigest.Rfc2616AbnfParser parser) throws Rfc2616AbnfParser.ParseException {
    parser.consumeRws().consumeToken68();
    if (parser.hasMoreData()) {
        int pos = parser.getPos();
        parser.consumeOws().consumeLiteral(",").setPos(pos);
    }
}