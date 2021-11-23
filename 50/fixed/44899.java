@java.lang.Override
public java.lang.Integer call() throws java.lang.Exception {
    long start = java.lang.System.currentTimeMillis();
    eu.eexcess.dataformats.result.ResultList resList = submitQueryToFedRec(string);
    long end = java.lang.System.currentTimeMillis();
    return resList.totalResults;
}