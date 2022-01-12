@java.lang.Override
public edu.utsa.fileflow.client.fileflow.FileFlowAnalysisDomain onFinish(edu.utsa.fileflow.client.fileflow.FileFlowAnalysisDomain domain) throws edu.utsa.fileflow.analysis.AnalysisException {
    edu.utsa.fileflow.utilities.GraphvizGenerator.saveDOTToFile(domain.post.toDot(), (("scripts/post" + (runCounter)) + ".dot"));
    edu.utsa.fileflow.utilities.GraphvizGenerator.saveDOTToFile(domain.init.toDot(), (("scripts/init" + (runCounter)) + ".dot"));
    lastInit = domain.init.clone();
    (runCounter)++;
    return domain;
}