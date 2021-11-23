public de.charite.compbio.jannovar.vardbs.exac.ExacPopulation popWithHighestAlleleFreq(int alleleNo) {
    double bestFreq = -1;
    de.charite.compbio.jannovar.vardbs.exac.ExacPopulation bestPop = ExacPopulation.ALL;
    for (de.charite.compbio.jannovar.vardbs.exac.ExacPopulation pop : de.charite.compbio.jannovar.vardbs.exac.ExacPopulation.values()) {
        if (alleleNo < (alleleFrequencies.get(pop).size()))
            if ((alleleFrequencies.get(pop).get(alleleNo)) > bestFreq) {
                bestFreq = alleleFrequencies.get(pop).get(alleleNo);
                bestPop = pop;
            }
        
    }
    return bestPop;
}