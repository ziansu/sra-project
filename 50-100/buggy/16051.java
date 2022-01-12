public java.util.List<java.lang.String> replace(java.util.List<java.lang.String> list, java.lang.String toReplace, java.lang.String replaceWith) {
    for (int i = 0; i < (list.size()); i++) {
        list.set(i, list.get(i).replace(toReplace, replaceWith));
    }
    return list;
}