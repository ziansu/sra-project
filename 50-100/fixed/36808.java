public boolean equalAst(java.util.List<T> first, java.util.List<T> second) {
    if ((first.size()) != (second.size())) {
        return false;
    }
    for (int i = 0; i < (first.size()); i++) {
        if (!(first.get(i).equalAst(second.get(i)))) {
            return false;
        }
    }
    return true;
}