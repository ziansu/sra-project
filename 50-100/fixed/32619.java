@java.lang.Override
@java.lang.SuppressWarnings(value = "rawtypes")
public void buildEnvironmentFor(@javax.annotation.Nonnull
hudson.model.Run run, @javax.annotation.Nonnull
hudson.EnvVars envs, @javax.annotation.Nonnull
hudson.model.TaskListener listener) throws java.io.IOException, java.lang.InterruptedException {
    org.jenkinsci.plugins.ghprb.GhprbParametersAction gpa = run.getAction(org.jenkinsci.plugins.ghprb.GhprbParametersAction.class);
    if (gpa != null) {
        for (hudson.model.ParameterValue p : gpa.getParameters()) {
            envs.put(p.getName(), java.lang.String.valueOf(p.getValue()));
        }
    }
    super.buildEnvironmentFor(run, envs, listener);
}