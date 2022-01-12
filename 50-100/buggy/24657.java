public static com.encryptorcode.abhay.infinitycalc.models.Tag[] tag(java.lang.String[] tokens) throws com.encryptorcode.abhay.infinitycalc.exceptions.IllegalExpressionException {
    com.encryptorcode.abhay.infinitycalc.models.Tag[] tags = com.encryptorcode.abhay.infinitycalc.controllers.ExpressionTagger.identifyTokens(tokens);
    com.encryptorcode.abhay.infinitycalc.controllers.ExpressionTagger.identifyOperators(tokens, tags);
    com.encryptorcode.abhay.infinitycalc.controllers.ExpressionTagger.verifyTags(tags);
    com.encryptorcode.abhay.infinitycalc.controllers.ExpressionTagger.verifyBrackets(tags);
    return tags;
}