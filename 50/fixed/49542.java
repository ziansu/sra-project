@java.lang.Override
public void clear() {
    values.clear();
    listBox.clear();
    if (initialized) {
        initializeMaterial(listBox.getElement());
    }
}