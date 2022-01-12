@java.lang.Override
public double getValidationScore(java.util.List<com.kushalarora.compositionalLM.languagemodel.Word> data) {
    com.kushalarora.compositionalLM.languagemodel.CompositionalGrammar.CompositionalInsideOutsideScore score = compGrammar.computeScore(data, model.getGrammar().computeScore(data));
    return score.getSentenceScore();
}