public data1.Data1.BST remove(int x) {
    if ((this.key) == x) {
        return this.right.union(this.left);
    }else
        if ((this.key) > x) {
            return new data1.Data1.Branch(this.left.remove(x), this.key, this.right);
        }else {
            return new data1.Data1.Branch(this.left, this.key, this.right.remove(x));
        }
    
}