public Item removeLast() {
    if (isEmpty())
        throw new java.util.NoSuchElementException();
    
    if ((size()) <= ((data.length) / 4))
        resize(((data.length) / 2));
    
    return data[(--(tail))];
}