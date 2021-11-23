void addIndependentTask(server.Task task) {
    server.TaskList.Node newNode = new server.TaskList.Node();
    newNode.task = task;
    server.TaskList.Node currentNode = root;
    while ((currentNode.next) != (end)) {
        if (!(currentNode.isLocked.get())) {
            insertNode(currentNode, newNode);
            return ;
        }
        currentNode = currentNode.next;
    } 
    insertNode(currentNode, newNode);
}