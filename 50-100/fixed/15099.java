public java.util.List<java.lang.Long> getVersions(int n, long maxVersion) {
    java.util.List<java.lang.Long> ret = new java.util.ArrayList<>(n);
    for (java.util.List<org.apache.solr.update.UpdateLog.Update> singleList : updateList) {
        for (org.apache.solr.update.UpdateLog.Update ptr : singleList) {
            if ((java.lang.Math.abs(ptr.version)) > (java.lang.Math.abs(maxVersion)))
                continue;
            
            ret.add(ptr.version);
            if ((--n) <= 0)
                return ret;
            
        }
    }
    return ret;
}