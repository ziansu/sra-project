@java.lang.Override
public void performSearch() throws nl.ru.crpx.search.QueryException {
    try {
        if ((crpThis) == null) {
            errHandle.DoError("There is no CRP");
            return ;
        }
        if (objEx.ExecuteQueriesFile(this, intCrpFileId)) {
            if (errHandle.bInterrupt) {
                errHandle.DoError("JobXqF: The program has been interrupted");
            }else {
                errHandle.debug("JobXqF: performSearch: ready handling job");
            }
        }else {
            errHandle.DoError("JobXqF: The queries could not be executed");
        }
    } catch (java.lang.Exception ex) {
        errHandle.DoError("JobXqF: Could not perform search", ex, nl.ru.crpx.search.JobXq.class);
    }
}