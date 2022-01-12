public void process(cmucoref.document.Sentence sent, edu.stanford.nlp.dcoref.Dictionaries dict) {
    getHeadword(sent, dict);
    setType(sent, dict);
    setDefiniteness(sent, dict);
    setNumber(sent, dict);
    setAnimacy(sent, dict);
    setGender(sent, dict, getGender(sent, dict));
    setPerson(sent, dict);
}