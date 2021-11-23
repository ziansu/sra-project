void defineLabels() {
    labelsValues = calcLabels();
    if (handleValues)
        labels = getLabelsFromValues();
    else
        labels = getLabelsFromData();
    
    nLabels = labels.size();
}