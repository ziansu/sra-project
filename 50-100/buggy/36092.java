@java.lang.Override
public void define(org.sonar.plugins.cxx.Context context) {
    org.sonar.plugins.cxx.NewRepository repository = context.createRepository(CheckList.REPOSITORY_KEY, CxxLanguage.KEY).setName(org.sonar.plugins.cxx.CxxRuleRepository.REPOSITORY_NAME);
    org.sonar.squidbridge.annotations.AnnotationBasedRulesDefinition.load(repository, CxxLanguage.KEY, org.sonar.cxx.checks.CheckList.getChecks());
    for (org.sonar.plugins.cxx.NewRule rule : repository.rules()) {
        rule.setInternalKey(rule.key());
    }
    org.sonar.squidbridge.rules.SqaleXmlLoader.load(repository, "/com/sonar/sqale/cxx-model.xml");
    repository.done();
}