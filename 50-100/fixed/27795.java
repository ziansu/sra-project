public double highestAlleleFreqOverall() {
    double result = 0;
    for (int alleleNo = 0; alleleNo < (alleleFrequencies.size()); ++alleleNo)
        if (alleleNo < (getAlleleFrequencies(popWithHighestAlleleFreq(alleleNo)).size()))
            result = java.lang.Math.max(result, getAlleleFrequencies(popWithHighestAlleleFreq(alleleNo)).get(alleleNo));
        
    
    return result;
}