public data1.Data1.BST add(int x) {
    if ((this.key) == x) {
        return this;
    }else
        if ((this.key) > x) {
            return new data1.Data1.Branch(this.left.add(x), this.key, this.right);
        }else {
            return new data1.Data1.Branch(this.left, this.key, this.right.add(x));
        }
    
}