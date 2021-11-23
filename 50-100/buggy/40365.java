public static final org.adempiere.ad.validationRule.IValidationRule compose(final org.adempiere.ad.validationRule.IValidationRule rule1, final org.adempiere.ad.validationRule.IValidationRule rule2) {
    if ((rule1 == null) || (rule1 == (NullValidationRule.instance))) {
        return rule2 == null ? NullValidationRule.instance : rule2;
    }
    if ((rule2 == null) || (rule2 == (NullValidationRule.instance))) {
        return NullValidationRule.instance;
    }
    final org.adempiere.ad.validationRule.impl.CompositeValidationRule composite = new org.adempiere.ad.validationRule.impl.CompositeValidationRule();
    composite.addValidationRule(rule1);
    composite.addValidationRule(rule2);
    return composite;
}