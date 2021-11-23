@java.lang.Override
public hudson.plugins.cobertura.CoberturaPublisher newInstance(org.kohsuke.stapler.StaplerRequest req, net.sf.json.JSONObject formData) throws hudson.plugins.cobertura.FormException {
    if (req == null) {
        return null;
    }
    hudson.plugins.cobertura.CoberturaPublisher instance = req.bindJSON(hudson.plugins.cobertura.CoberturaPublisher.class, formData);
    org.apache.commons.beanutils.ConvertUtils.register(CoberturaPublisherTarget.CONVERTER, hudson.plugins.cobertura.targets.CoverageMetric.class);
    java.util.List<hudson.plugins.cobertura.CoberturaPublisherTarget> targets = req.bindParametersToList(hudson.plugins.cobertura.CoberturaPublisherTarget.class, "cobertura.target.");
    instance.setTargets(targets);
    return instance;
}