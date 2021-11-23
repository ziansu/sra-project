public void addLast(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    if ((size()) >= (data.length))
        resize(((data.length) * 2));
    
    data[((tail)++)] = item;
}