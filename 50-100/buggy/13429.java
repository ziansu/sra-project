public boolean remove(int val) {
    if (elemToPos.containsKey(val)) {
        int position = elemToPos.get(val);
        swap(elements, position, ((elements.size()) - 1));
        elements.remove(((elements.size()) - 1));
        return true;
    }else {
        return false;
    }
}