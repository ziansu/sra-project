@java.lang.Override
public T next() {
    if ((iterators.size()) == 0)
        throw new java.util.NoSuchElementException();
    
    while (true) {
        if (iterators.get(index).hasNext()) {
            return iterators.get(index).next();
        }else
            if ((index) < ((iterators.size()) - 1)) {
                ++(index);
            }else {
                throw new java.util.NoSuchElementException();
            }
        
    } 
}