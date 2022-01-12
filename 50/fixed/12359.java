@java.lang.Override
public java.lang.Integer previous() {
    if (!(hasPrevious()))
        throw new java.util.NoSuchElementException();
    
    return --(position);
}