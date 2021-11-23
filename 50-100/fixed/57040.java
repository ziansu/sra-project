public void toggleAll(javax.faces.event.ValueChangeEvent e) {
    areAllChecked = (areAllChecked) ? false : true;
    for (int i = 0; i < (dataList.size()); i++) {
        ((org.gudmap.models.ArraySeqTableBeanModel) (dataList.get(i))).setSelected(areAllChecked);
    }
}