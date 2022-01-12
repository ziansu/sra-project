@lombok.SneakyThrows
public double computeCompInsideOutsideScores() {
    considerCreatingMatrices();
    initializeMatrices();
    com.kushalarora.compositionalLM.lang.IInsideOutsideScore preScorer = model.getGrammar().computeScore(sentence);
    log.info("Starting Computational inside score");
    doInsideScore();
    log.info("Computed Computational inside score");
    log.info("Starting Computational outside score");
    doOutsideScore();
    log.info("Computed Computational outside score");
    log.info("Starting Computational mu score");
    doMuScore();
    log.info("Starting Computational mu score");
    return compositionalIScore[0][length];
}