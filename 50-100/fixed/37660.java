public void add(int index, T item) {
    if (index > (last_item))
        return ;
    
    if ((last_item) == ((array.length) - 1))
        resize(((array.length) * 2));
    
    for (int i = (last_item) - 1; i > index; i--) {
        array[i] = array[(i - 1)];
    }
    array[index] = item;
    (last_item)++;
}