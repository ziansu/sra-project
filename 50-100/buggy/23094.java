public void setElements(int arrayResourceId, int selectedPosition) {
    java.lang.String[] elements = this.getResources().getStringArray(arrayResourceId);
    int size = (elements == null) ? 0 : elements.length;
    boolean[] selected = new boolean[size];
    if ((selectedPosition >= 0) && (selectedPosition < size)) {
        selected[selectedPosition] = true;
    }
    setElements(elements, selected);
}