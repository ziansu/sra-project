@java.lang.Override
public void visitSentence(net.alloyggp.griddle.grammar.Sentence sentence) {
    if ((!(producedSentenceNames.contains(sentence.getName()))) && (!(producedSentenceNames.contains(sentence.getName().toLowerCase())))) {
        reporter.report((("Rule references a sentence with a name " + (sentence.getName())) + " that is not produced by any rule or standalone sentence."), sentence.getPosition());
    }
}