@java.lang.Override
public void run(java.lang.String token, us.kbase.kbasegenefamilies.SearchDomainsParams inputData, java.lang.String jobId, java.lang.String outRef) throws java.lang.Exception {
    us.kbase.kbasegenefamilies.DomainSearchTask dst = new us.kbase.kbasegenefamilies.DomainSearchTask(tempDir, storage);
    us.kbase.kbasegenefamilies.DomainAnnotation res = dst.runDomainSearch(token, inputData.getDmsRef(), inputData.getGenome());
    saveResult(inputData.getOutWorkspace(), inputData.getOutResultId(), token, res, inputData);
}