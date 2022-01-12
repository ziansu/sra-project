public void addChild(java.lang.String folderId, org.apache.zeppelin.notebook.Folder child) {
    if (child == (this))
        return ;
    
    children.put(folderId, child);
}