public static org.genepattern.pipelines.ResponseJSON createModuleList(java.util.Vector<org.genepattern.data.pipeline.JobSubmission> jobs) {
    org.genepattern.pipelines.ResponseJSON listObject = new org.genepattern.pipelines.ResponseJSON();
    java.lang.Integer idCounter = 0;
    for (org.genepattern.data.pipeline.JobSubmission i : jobs) {
        org.genepattern.pipelines.ModuleJSON module = new org.genepattern.pipelines.ModuleJSON(idCounter, i);
        listObject.addChild(idCounter, module);
        idCounter++;
    }
    return listObject;
}