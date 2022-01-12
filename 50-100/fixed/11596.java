@java.lang.Override
public java.util.LinkedList<com.compomics.util.experiment.identification.matches.SpectrumMatch> getAllSpectrumMatches(com.compomics.util.waiting.WaitingHandler waitingHandler, com.compomics.util.experiment.identification.identification_parameters.SearchParameters searchParameters, com.compomics.util.preferences.SequenceMatchingPreferences sequenceMatchingPreferences, boolean expandAaCombinations) throws java.io.IOException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException, java.lang.InterruptedException, java.sql.SQLException, javax.xml.bind.JAXBException, org.xmlpull.v1.XmlPullParserException {
    if ((spectrumMatches) == null) {
        parseFile(waitingHandler, expandAaCombinations, true);
    }
    return spectrumMatches;
}