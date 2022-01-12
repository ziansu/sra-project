public void setInitValue(java.util.List<java.lang.Object> list) {
    java.lang.Object obj2;
    if ((collectionType) == null)
        obj2 = list.get(0);
    else {
        obj2 = collectionType.fromList(list, getItemClass());
    }
    this.initValue = obj2;
}