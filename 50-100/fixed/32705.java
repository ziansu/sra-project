@java.lang.Override
public boolean remove(java.lang.String element) {
    if (!(contains(element))) {
        return false;
    }
    ru.spbau.mit.StringSetImpl.Vertex temp = root;
    for (int i = 0; i < (element.length()); i++) {
        int ind = ru.spbau.mit.StringSetImpl.index(element.charAt(i));
        (temp.count)--;
        temp = temp.next[ind];
    }
    temp.isLeaf = false;
    (temp.count)--;
    (size)--;
    return true;
}