public linked_yarn.LinkedYarn clone() {
    linked_yarn.LinkedYarn linkYarnClone = new linked_yarn.LinkedYarn();
    linkYarnClone.size = this.size;
    linkYarnClone.modCount = this.modCount;
    linked_yarn.LinkedYarn.Node currentNode = this.head;
    while (currentNode != null) {
        linkYarnClone.addNewNode(currentNode.text, currentNode.count);
        currentNode = currentNode.next;
    } 
    return linkYarnClone;
}