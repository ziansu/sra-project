private static void consumeChallenge(com.albroco.barebonesdigest.Rfc2616AbnfParser parser) throws Rfc2616AbnfParser.ParseException {
    parser.consumeToken();
    int savedPos = parser.getPos();
    try {
        com.albroco.barebonesdigest.WwwAuthenticateHeader.consumeToEndOfEmptyOrAuthParamBasedChallenge(parser);
    } catch (com.albroco.barebonesdigest.Rfc2616AbnfParser e) {
        parser.setPos(savedPos);
        com.albroco.barebonesdigest.WwwAuthenticateHeader.consumeToEndOfToken68BasedChallenge(parser);
    }
}