public Product remove(int id) {
    if ((this.root) == null) {
        return null;
    }
    ProductBinarySearchTree.Node target = this.find(id);
    this.remove(target, this.root);
    return target.element;
}