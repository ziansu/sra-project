@java.lang.SuppressWarnings(value = "unchecked")
public T get(int index) {
    if (index < 0)
        return null;
    
    collections.Node<T> current = null;
    if ((root) != null) {
        current = root;
        for (int i = 0; i < index; i++) {
            if ((current.getNext()) == null)
                return null;
            
            current = current.getNext();
        }
        return current.getInfo();
    }
    return ((T) (current));
}