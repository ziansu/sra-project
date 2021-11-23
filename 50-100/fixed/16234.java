@java.lang.Override
public edu.utsa.fileflow.client.fileflow.FileFlowAnalysisDomain onBegin(edu.utsa.fileflow.client.fileflow.FileFlowAnalysisDomain domain, edu.utsa.fileflow.cfg.FlowPoint flowPoint) throws edu.utsa.fileflow.analysis.AnalysisException {
    java.lang.System.out.println(("\n***** Run: " + (runCounter)));
    if ((runCounter) > 0) {
        domain.post = lastInit;
        flowPoint.setDomain(domain);
    }
    return super.onBegin(domain, flowPoint);
}