public void addToEnd(mazeUtil.Location newLocation) {
    if ((root) == null) {
        root = new mazeUtil.LocationListNode(newLocation);
        (this.length)++;
    }else {
        mazeUtil.LocationListNode currentNode = root;
        while ((currentNode.next) != null) {
            currentNode = currentNode.next;
        } 
        currentNode.next = new mazeUtil.LocationListNode(newLocation);
        (this.length)++;
    }
}