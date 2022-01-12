private void minusminus(practicum.DataPack.Data.Node a, practicum.DataPack.Data.Node b) {
    if ((a.childs) == null) {
        a.value = (a.value) - (b.value);
        return ;
    }
    for (int i = 0; i < (a.childs.size()); i++) {
        plusplus(a.childs.get(i), b.childs.get(i));
    }
}