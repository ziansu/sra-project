private void setRuleRegex() {
    PolyGlot.DeclensionGenRule rule = ((PolyGlot.DeclensionGenRule) (lstRules.getSelectedValue()));
    java.lang.String ruleRegex = txtRuleRegex.getText().trim();
    if ((!(curPopulating)) && (rule != null)) {
        rule.setRegex(ruleRegex);
    }
}