@java.lang.Override
public void evaluate() throws java.lang.Throwable {
    p = jenkins().createProject(org.jenkinsci.plugins.workflow.job.WorkflowJob.class, "demo");
    p.setDefinition(new org.jenkinsci.plugins.workflow.cps.CpsFlowDefinition(join(("import " + (hudson.AbortException.class.getName())), ("import " + (org.jenkinsci.plugins.workflow.cps.steps.ParallelStepException.class.getName())), "node {", "    parallel(", "      a: { echo 'hello from a';sleep 1;echo 'goodbye from a' },", "      b: { echo 'hello from b';sleep 1;echo 'goodbye from b' },", "      c: { echo 'hello from c';sleep 1;echo 'goodbye from c' },", "      d: { echo 'hello from d' },", "      failFast: true", "    )", "}")));
    startBuilding().get();
    assertBuildCompletedSuccessfully();
}