public void setList(org.eclipse.ice.datastructures.ICEObject.ListComponent list) {
    this.list = list;
    this.source = list.getElementSource();
    org.eclipse.ice.datastructures.ICEObject.ListComponent tableList = this.table.getList();
    tableList.clear();
    tableList.addAll(list);
}