@java.lang.Override
public void columnChanged(prefuse.data.column.Column src, int idx, java.lang.Object prev) {
    if (edu.gatech.cs7450.prefuse.ScanGroupView._log.isDebugEnabled())
        edu.gatech.cs7450.prefuse.ScanGroupView._log.debug(((((("src=" + src) + ", idx=") + idx) + ", prev=") + prev));
    
    if (prev != null)
        scanGroupToNode.remove(prev);
    
    java.lang.String newId = src.getString(idx);
    if (newId != null)
        scanGroupToNode.put(newId, graph.getNode(idx));
    
}