@org.testng.annotations.AfterMethod
public void afterMethod() throws java.lang.Exception {
    quitBrowser();
    results.ConsolidatingPassFail cpf = new results.ConsolidatingPassFail();
    cpf.updateTestcases();
    results.MetricsGeneration chartresults = new results.MetricsGeneration();
    chartresults.writeChart();
    results.MergeChart merge = new results.MergeChart();
    merge.Merge();
    results.DefectUpdate defects = new results.DefectUpdate();
    defects.Defect();
    tfs.Defectcreation tfs = new tfs.Defectcreation();
    tfs.createBugsinTFS();
}