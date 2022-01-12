public void setSelection(T selection) {
    for (int i = 0, count = getItems().size(); i < count; i++) {
        T item = getItems().get(i);
        if (item instanceof java.lang.String) {
            if (item.equals(selection)) {
                setSelection(i);
                return ;
            }
        }else {
            if (item == selection) {
                setSelection(i);
                return ;
            }
        }
    }
}