@java.lang.Override
public boolean contains(java.lang.String element) {
    ru.spbau.mit.StringSetImpl.Vertex temp = this.root;
    for (int i = 0; i < (element.length()); i++) {
        int ind = ru.spbau.mit.StringSetImpl.index(element.charAt(i));
        if ((temp.next[ind]) == null) {
            return false;
        }
        temp = temp.next[ind];
    }
    return temp.isLeaf;
}