@java.lang.Override
public void provideContext(java.lang.String input) {
    this.input = input;
    twitter.interpreter.QAActor.logger.debug("Generating QA response for text: {}", input);
    java.lang.String attName = "type";
    java.lang.String attValue = "certain";
    store.setAttribute(attName, attValue);
    answer = store.bestMatch(input);
    twitter.interpreter.QAActor.logger.debug("Got QA response: {}", answer);
    wantToAct = true;
}