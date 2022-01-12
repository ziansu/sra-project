private void minusminus(practicum.DataPack.Data.Node a, practicum.DataPack.Data.Node b) {
    if ((a.childs) == null) {
        a.value = (b.value) - (a.value);
        return ;
    }
    for (int i = 0; i < (a.childs.size()); i++) {
        minusminus(a.childs.get(i), b.childs.get(i));
    }
}