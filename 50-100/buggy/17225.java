@java.lang.Override
public double init() {
    double sum = 0.0;
    for (int i = 0; i < (indexes.length); ++i) {
        double sumSimilarity = 0.0;
        for (int j = 0; j < (indexes.length); ++j)
            sumSimilarity += similarity[indexes[j]][indexes[i]];
        
        sum += 1.0 - (1.0 / sumSimilarity);
    }
    return sum / (similarity.length);
}