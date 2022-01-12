public void removeIfEmpty(java.lang.String id) {
    checkPrivilege();
    if (!(id.startsWith("$")))
        throw new java.lang.IllegalArgumentException(("not an id or composite id: " + id));
    
    org.agilewiki.utils.virtualcow.ListNode listNode = dbMapNode.getList(id);
    if (listNode == null)
        return ;
    
    if (!(listNode.isEmpty()))
        return ;
    
    dbMapNode.remove(id);
}