public void doSeverityPieGraph(org.kohsuke.stapler.StaplerRequest req, org.kohsuke.stapler.StaplerResponse rsp) throws java.io.IOException {
    if ((hudson.util.ChartUtil.awtProblemCause) != null) {
        rsp.sendRedirect2(((req.getContextPath()) + "/images/headless.png"));
        return ;
    }
    hudson.util.ChartUtil.generateGraph(req, rsp, org.jenkins.ci.plugins.jenkinslint.graph.JenkinsLintGraph.createSeverityPieChart(this.getJobSet().elements(), this.getCheckSet()), 512, 384);
}