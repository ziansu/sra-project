public void setSelection(T selection) {
    for (int i = 0, count = getItems().size(); i < count; i++) {
        T item = getItems().get(i);
        if (item == selection) {
            setSelection(i);
            return ;
        }
    }
}