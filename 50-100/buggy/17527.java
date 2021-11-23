public static void main(java.lang.String[] args) throws gate.util.GateException, java.io.IOException, java.net.URISyntaxException, net.asteasolutions.cinusuidi.sluncho.questionparser.exception.QuestionParserException {
    net.asteasolutions.cinusuidi.sluncho.BeforeStartConfig.configSystemProperties();
    gate.Gate.init();
    net.asteasolutions.cinusuidi.sluncho.App.questionParser.init();
    net.asteasolutions.cinusuidi.sluncho.utils.ThreeGramProbabilityRepo.loadProbability();
    net.asteasolutions.cinusuidi.sluncho.oneOutValidation.OneOutValidation a = new net.asteasolutions.cinusuidi.sluncho.oneOutValidation.OneOutValidation();
    net.asteasolutions.cinusuidi.sluncho.documentIndex.IdentityDocumentParser idParser = new net.asteasolutions.cinusuidi.sluncho.documentIndex.IdentityDocumentParser();
    net.asteasolutions.cinusuidi.sluncho.data.QuestionRepository repo = net.asteasolutions.cinusuidi.sluncho.data.QuestionRepository.Instance();
    net.asteasolutions.cinusuidi.sluncho.oneOutValidation.OneOutValidation testUnit = new net.asteasolutions.cinusuidi.sluncho.oneOutValidation.OneOutValidation();
    testUnit.runWordEmbeddingsClassifierrRandomTest(5);
}