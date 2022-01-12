static java.util.List<cz.vutbr.web.css.CombinedSelector> createCombinedSelectors(final java.lang.String selectorText) {
    final cz.vutbr.web.css.StyleSheet jSheet = co.uproot.css.domimpl.CSSUtils.parse((selectorText + "{}"));
    if ((jSheet.size()) > 0) {
        final cz.vutbr.web.css.RuleSet ruleSet = ((cz.vutbr.web.css.RuleSet) (jSheet.get(0)));
        return java.util.Arrays.asList(ruleSet.getSelectors());
    }
    return new java.util.ArrayList<cz.vutbr.web.css.CombinedSelector>();
}