@javax.annotation.PostConstruct
public void trainBayes() {
    com.sa.model.Bayes.BayesImplementationModel bayesImplementationModel = bayesRepository.findByItemId(0L);
    if (bayesImplementationModel == null) {
        bayesImplementationModel = bayesRepository.save(new com.sa.model.Bayes.BayesImplementationModel());
        bayesImplementationService.setupBayesModel(bayesImplementationModel);
        bayesImplementationService.registerLabels();
        processCSV();
        bayesRepository.save(bayesImplementationService.getBayesModel());
    }else {
        bayesImplementationService.setupBayesModel(bayesImplementationModel);
    }
}