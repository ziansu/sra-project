public java.lang.Integer counterAt(java.lang.Integer index) throws java.lang.IndexOutOfBoundsException {
    if ((index < (this.counters)) && (index >= 0))
        return array[index];
    else
        throw new java.lang.IndexOutOfBoundsException("The specified counter does not exist on this Bloom filter");
    
}