public int selectPluralForm(final int number) {
    final int absNumber = java.lang.Math.abs(number);
    int pluralForm;
    if ((absNumber != 11) && (net.sf.jfuzzydate.i18n.PluralRule.endsBetween(absNumber, 1, 1, 1))) {
        pluralForm = 0;
    }else
        if (((absNumber < 12) && (absNumber > 14)) && (net.sf.jfuzzydate.i18n.PluralRule.endsBetween(absNumber, 2, 4, 1))) {
            pluralForm = 1;
        }else {
            pluralForm = 2;
        }
    
    return pluralForm;
}