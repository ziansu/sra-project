private int nextChar() {
    int r;
    if (EOFFound)
        return -1;
    
    if ((r = reader.get()) != (-1))
        return r;
    
    EOFFound = true;
    return '\n';
}