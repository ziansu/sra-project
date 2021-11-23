@java.lang.Override
public double init() {
    double sum = 0.0;
    for (int i = 0; i < (indexes.length); ++i) {
        double sumSimilarity = 0.0;
        for (int j = 0; j < (indexes.length); ++j)
            sumSimilarity += similarity[indexes[i]][indexes[j]];
        
        sum += 1.0 - (1.0 / sumSimilarity);
    }
    return sum / (indexes.length);
}