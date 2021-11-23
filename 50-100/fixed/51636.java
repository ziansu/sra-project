private java.util.List getEnactments() {
    java.util.List result = query.queryHql(net.sourceforge.processdash.tool.probe.wizard.ProbeDatabaseUtil.ENACTMENT_QUERY, includedWorkflowKeys);
    if ((onlyInclude) != null) {
        for (java.util.Iterator i = result.iterator(); i.hasNext();) {
            java.lang.Object[] row = ((java.lang.Object[]) (i.next()));
            java.lang.Object identifier = row[1];
            if (!(onlyInclude.contains(identifier)))
                i.remove();
            
        }
    }
    return result;
}