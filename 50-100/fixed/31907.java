@java.lang.Override
public java.util.List<org.languagetool.language.Rule> getRelevantRules(java.util.ResourceBundle messages) throws java.io.IOException {
    java.util.List<org.languagetool.language.Rule> rules = new java.util.ArrayList<>();
    rules.addAll(super.getRelevantRules(messages));
    rules.add(new org.languagetool.rules.pt.PostReformPortugueseCompoundRule(messages));
    rules.add(new org.languagetool.rules.pt.PortugalPortugueseReplaceRule(messages));
    rules.add(new org.languagetool.rules.pt.PortugueseAgreementReplaceRule(messages));
    return rules;
}