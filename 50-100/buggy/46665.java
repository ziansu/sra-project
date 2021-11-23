@java.lang.Override
protected java.lang.String getLabel(com.googlecode.lanterna.gui2.RadioBoxList<V> listBox, int index, V item) {
    java.lang.String check = " ";
    if ((listBox.checkedIndex) == index)
        check = "o";
    
    java.lang.String text = (item != null ? item : "<null>").toString();
    return (("<" + check) + "> ") + text;
}