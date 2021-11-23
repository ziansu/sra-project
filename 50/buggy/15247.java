@java.lang.Override
protected java.lang.String applyRule(java.lang.String word) {
    java.lang.String res = word + (org.kafkapre.translator.impl.VowelTranslateRule.suffix);
    return res;
}