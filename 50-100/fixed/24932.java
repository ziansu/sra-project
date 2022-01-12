public java.util.List<com.unalsoft.elitefle.presentation.controller.ElementXML> getTitleElems() {
    java.util.List<com.unalsoft.elitefle.presentation.controller.ElementXML> elems = new java.util.ArrayList<com.unalsoft.elitefle.presentation.controller.ElementXML>();
    if (((text) != null) && ((text.getContenu().getTitre()) != null)) {
        java.util.List<com.unalsoft.elitefle.presentation.controller.Phrase> phrases = text.getContenu().getTitre().getPhrase();
        for (com.unalsoft.elitefle.presentation.controller.Phrase phrase : phrases) {
            addPhraseElems(phrase, elems);
        }
    }
    return elems;
}