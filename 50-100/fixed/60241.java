public double f1(java.lang.Integer classLabel) {
    double precision = precision(classLabel);
    double recall = recall(classLabel);
    if ((precision == 0) || (recall == 0))
        return 0;
    
    return 2.0 * ((precision * recall) / (precision + recall));
}