public static int getExclMarkMistakes(java.lang.String message) {
    if ((hatespeech.detection.hsprocessor.FeatureExtractor.checkedMessage) != null)
        hatespeech.detection.hsprocessor.FeatureExtractor.checkedMessage = hatespeech.detection.hsprocessor.FeatureExtractor.spellCorr.findMistakes(message);
    
    return hatespeech.detection.hsprocessor.FeatureExtractor.checkedMessage.getExclMarkMistakes();
}