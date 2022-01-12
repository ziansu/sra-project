public boolean compatibleWith(edu.stanford.nlp.international.Language other) {
    return (((this) == other) || ((this) == (edu.stanford.nlp.international.Language.Any))) || (other == (edu.stanford.nlp.international.Language.Any));
}