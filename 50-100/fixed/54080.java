private void resize(int max) {
    Item[] temp = ((Item[]) (new java.lang.Object[max]));
    for (int i = 0; i < (count); i++) {
        temp[i] = array[i];
    }
    array = temp;
}