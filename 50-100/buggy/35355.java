@java.lang.Override
public boolean hasNext() {
    if ((iterators.size()) == 0)
        return false;
    
    boolean res = iterators.get(index).hasNext();
    if ((!res) && ((index) < ((iterators.size()) - 1)))
        res = iterators.get((++(index))).hasNext();
    
    return res;
}