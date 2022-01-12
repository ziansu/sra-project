private double[][] extractFeatures(java.util.ArrayList<Data.Species> dataset) {
    double[][] features = new double[dataset.size()][];
    int counter = 0;
    int len = dataset.get(0).getFeatureValues().length;
    java.util.Iterator<Data.Species> i = dataset.iterator();
    while (i.hasNext()) {
        features[counter] = i.next().getFeatureValues();
        counter++;
    } 
    return features;
}