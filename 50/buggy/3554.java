public java.lang.String getNextTestCase() {
    if ((de.fraunhofer.iosb.ivct.CommandCache.i) < (testcases.size())) {
        return testcases.get(((de.fraunhofer.iosb.ivct.CommandCache.i)++));
    }else {
        return null;
    }
}