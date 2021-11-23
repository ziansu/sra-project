protected void addChildren(Node[] array) throws java.lang.CloneNotSupportedException {
    if (hasKids()) {
        this.union(array);
    }else {
        this.children = array;
        setKids(children.length);
    }
}