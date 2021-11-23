private void throwIfErrorResponse() {
    if (!(wasSuccessful())) {
        throw new de.measite.minidns.hla.ResolutionUnsuccessfulException(question, responseCode);
    }
}