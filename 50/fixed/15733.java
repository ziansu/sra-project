private void normalizeUserFrequency() {
    double normalizeDivision = (dictionaryFrequencyPercentage) + (userActualityPercentage);
    dictionaryFrequencyPercentage += (userFrequencyPercentage) * ((dictionaryFrequencyPercentage) / normalizeDivision);
    userActualityPercentage += (userFrequencyPercentage) * ((userActualityPercentage) / normalizeDivision);
    userFrequencyPercentage = 0;
}