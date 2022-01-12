public static void main(java.lang.String[] args) throws java.lang.Exception {
    org.apache.flink.api.java.ExecutionEnvironment env = org.apache.flink.api.java.ExecutionEnvironment.getExecutionEnvironment();
    org.gradoop.flink.util.GradoopFlinkConfig gradoopConf = org.gradoop.flink.util.GradoopFlinkConfig.createConfig(env);
    gradoopify.GradoopFiller gf = new gradoopify.GradoopFiller(gradoopConf);
    org.gradoop.flink.model.impl.LogicalGraph graph = gf.parseGitRepoIntoGraph(".");
    analysis.GitAnalyzer ga = new analysis.GitAnalyzer();
    org.gradoop.flink.model.impl.LogicalGraph userCountGraph = ga.createUserCount(graph);
    userCountGraph.getGraphHead().print();
    org.gradoop.flink.model.impl.LogicalGraph branchGroupedGraph = ga.transforBranchesToSubgraphs(graph);
}