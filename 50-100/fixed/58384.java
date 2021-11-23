public int getSelectedSize() {
    int j = 0;
    for (int i = 0; i < (mList.size()); i++) {
        if (mList.get(i).isCheckbox_delete()) {
            j++;
        }
    }
    return j;
}