protected java.util.ArrayList<java.lang.String> getLabelsFromData() {
    int size = chartView.data.get(0).size();
    java.util.ArrayList<java.lang.String> result = new java.util.ArrayList<java.lang.String>(size);
    for (int i = 0; i < size; i++)
        result.add(chartView.data.get(0).getLabel(i));
    
    return result;
}