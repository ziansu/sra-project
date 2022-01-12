public boolean remove(int val) {
    if (elemToPos.containsKey(val)) {
        int position = elemToPos.get(val);
        swap(elements, elemToPos, position, ((elements.size()) - 1));
        elements.remove(((elements.size()) - 1));
        elemToPos.remove(val);
        return true;
    }else {
        return false;
    }
}