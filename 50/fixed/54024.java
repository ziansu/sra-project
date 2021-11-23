public E get(int i) throws java.lang.ArrayIndexOutOfBoundsException {
    if ((i < 0) || (i >= (size())))
        throw new java.lang.ArrayIndexOutOfBoundsException("Elemento non trovato");
    
    return this.elements.get(i);
}