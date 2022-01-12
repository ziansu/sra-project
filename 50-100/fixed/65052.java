@java.lang.Override
public void replaceValue(int index, java.util.List<java.lang.Double> values) {
    if ((values == null) || ((values.size()) != (timeSeriesUnivariateList.size())))
        throw new java.lang.IllegalArgumentException("TimeSeriesMultivariate: insert values are invalid");
    
    for (int i = 0; i < (timeSeriesUnivariateList.size()); i++)
        timeSeriesUnivariateList.get(i).replaceValue(index, values.get(i));
    
}