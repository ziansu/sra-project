public E pop() {
    if (!(isEmpty())) {
        E element = elements.get(0);
        for (int i = 0; i < ((elements.size()) - 1); i++) {
            elements.set(i, elements.get((i + 1)));
        }
        elements.remove(((elements.size()) - 1));
        return element;
    }else
        return null;
    
}