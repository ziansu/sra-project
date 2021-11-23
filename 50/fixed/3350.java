public void throwIfErrorResponse() throws de.measite.minidns.hla.ResolutionUnsuccessfulException {
    if (!(wasSuccessful())) {
        throw new de.measite.minidns.hla.ResolutionUnsuccessfulException(question, responseCode);
    }
}