private grammar.Sentence start(edu.stanford.nlp.trees.Tree t) throws exceptions.CantFindSuchAnEntityException, exceptions.WrongGrammarRuleException {
    t.pennPrint();
    try {
        return order(t);
    } catch (exceptions.WrongGrammarRuleException e) {
        try {
            return relativeClauseSentence(t);
        } catch (exceptions.WrongGrammarRuleException e2) {
            return declarativeSentence(t);
        }
    }
}