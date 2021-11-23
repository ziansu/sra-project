@java.lang.Override
public void generateSamples() {
    int n = ((int) (java.lang.Math.sqrt(numSamples)));
    for (int j = 0; j < n; j++)
        for (int k = 0; k < n; k++)
            squareSamples.add(new utilities.Point2D(((k + 0.5) / n), ((j + 0.5) / n)));
        
    
}