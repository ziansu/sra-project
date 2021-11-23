public void toggleAll(javax.faces.event.ValueChangeEvent e) {
    boolean temp = ((java.lang.Boolean) (e.getNewValue()));
    areAllChecked = (areAllChecked) ? false : true;
    for (int i = 0; i < (dataList.size()); i++) {
        ((org.gudmap.models.ArraySeqTableBeanModel) (dataList.get(i))).setSelected(areAllChecked);
    }
}