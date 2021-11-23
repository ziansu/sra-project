public linked_yarn.LinkedYarn clone() {
    linked_yarn.LinkedYarn linkYarnClone = new linked_yarn.LinkedYarn();
    linkYarnClone.size = this.size;
    linkYarnClone.uniqueSize = this.uniqueSize;
    linkYarnClone.modCount = this.modCount;
    linked_yarn.LinkedYarn.Node currentNode = this.head;
    for (int i = 0; i < (this.uniqueSize); i++) {
        linkYarnClone.addNewNode(currentNode.text, currentNode.count);
        if ((currentNode.next) != null) {
            currentNode = currentNode.next;
        }
    }
    return linkYarnClone;
}