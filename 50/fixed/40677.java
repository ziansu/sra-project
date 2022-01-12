@java.lang.Override
public void init() {
    errors = new java.util.ArrayList<>();
    subscribeTo(ApexGrammarRuleKey.RECOVERED_MEMBER, ApexGrammarRuleKey.RECOVERED_STATEMENT);
}