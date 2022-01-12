@java.lang.Override
protected java.lang.String getLabel(com.googlecode.lanterna.gui2.CheckBoxList<V> listBox, int index, V item) {
    java.lang.String check = " ";
    java.util.List<java.lang.Boolean> itemStatus = listBox.itemStatus;
    if (itemStatus.get(index))
        check = "x";
    
    java.lang.String text = item.toString();
    return (("[" + check) + "] ") + text;
}