@java.lang.Override
public boolean hasNext() {
    while (true) {
        if ((index) > ((iterators.size()) - 1)) {
            return false;
        }else
            if (iterators.get(index).hasNext()) {
                return true;
            }else {
                ++(index);
            }
        
    } 
}