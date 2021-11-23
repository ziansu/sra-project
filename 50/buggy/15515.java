@org.junit.Test
public void detectFlagVariables() throws cs.vt.analysis.analyzer.analysis.AnalysisException {
    cs.vt.analysis.analyzer.analysis.Analyzer analyzer = new cs.vt.analysis.analyzer.analysis.BroadCastWorkAround();
    analyzer.setProject(project);
    analyzer.analyze();
    java.lang.System.out.println(analyzer.getReport().getJSONReport());
}