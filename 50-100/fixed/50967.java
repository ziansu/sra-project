private br.univali.ps.ui.inspetor.ItemDaLista getItemDoNo(br.univali.portugol.nucleo.asa.NoDeclaracao no) {
    br.univali.ps.ui.inspetor.ComparadorDeNos comparador = new br.univali.ps.ui.inspetor.ComparadorDeNos();
    for (int i = 0; i < (model.getSize()); i++) {
        br.univali.ps.ui.inspetor.ItemDaLista item = model.getElementAt(i);
        if (comparador.mesmoNo(item.getNoDeclaracao(), no)) {
            return item;
        }
    }
    return null;
}