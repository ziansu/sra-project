@java.lang.Override
public boolean contains(java.lang.String id) {
    boolean contained = false;
    for (int i = 0; i < (stack.size()); i++) {
        if (stack.get(i).containsKey(id)) {
            contained = true;
        }
    }
    return contained;
}