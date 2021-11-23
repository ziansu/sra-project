public static java.lang.String parsePolicy(java.lang.String input) throws cpabe.policy.ParseException {
    try {
        cpabe.policy.ASTStart policy = cpabe.policy.ParseTree.createParseTree(input.replace(",", "."));
        return cpabe.policy.PolicyParsing.postFix(policy);
    } catch (cpabe.policy.TokenMgrError e) {
        throw new cpabe.policy.ParseException(e.getMessage());
    }
}