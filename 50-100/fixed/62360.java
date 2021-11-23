@java.lang.Override
public boolean storeIndicator(java.lang.String elementToAnalyze, org.talend.dataquality.indicators.Indicator indicator) {
    boolean ok = true;
    final java.util.List<org.talend.dataquality.indicators.Indicator> indicatorLeaves = org.talend.dataquality.helpers.IndicatorHelper.getIndicatorLeaves(indicator);
    for (org.talend.dataquality.indicators.Indicator leaf : indicatorLeaves) {
        if ((!(this.allIndicators.contains(leaf))) && (!(org.talend.utils.collections.MultiMapHelper.addUniqueObjectToListMap(elementToAnalyze, leaf, elementToIndicators)))) {
            ok = false;
        }
    }
    this.allIndicators.addAll(indicatorLeaves);
    return ok;
}