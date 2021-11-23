public void addFile(java.lang.String fileName, org.sem8.ds.rest.resource.NodeResource node) {
    java.util.List<org.sem8.ds.rest.resource.NodeResource> temp;
    temp = this.fileMap.get(fileName);
    if (temp != null) {
        temp.add(node);
    }else {
        temp = new java.util.ArrayList<org.sem8.ds.rest.resource.NodeResource>();
        temp.add(node);
        this.fileMap.put(fileName, temp);
    }
}