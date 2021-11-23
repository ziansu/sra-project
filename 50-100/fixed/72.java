private double[][] extractFeatures(java.util.ArrayList<Data.Species> dataset) {
    double[][] features = new double[dataset.size()][];
    int counter = 0;
    java.util.Iterator<Data.Species> i = dataset.iterator();
    while (i.hasNext()) {
        features[counter] = i.next().getFeatureValues();
        counter++;
    } 
    return features;
}