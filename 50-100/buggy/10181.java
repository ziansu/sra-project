public void removeFieldListItem(java.lang.String getter, java.lang.String childListName, java.lang.String selectionName) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.reflect.InvocationTargetException {
    java.lang.reflect.Method mthGetSelected = this.getClass().getMethod(("get" + (com.mcmatica.entity.webui.common.Utility.capitalize(selectionName))));
    com.mcmatica.entity.webui.model.BaseEntityModel itemselected;
    itemselected = ((com.mcmatica.entity.webui.model.BaseEntityModel) (mthGetSelected.invoke(this)));
    this.removeFieldListItem(getter, childListName, itemselected);
}