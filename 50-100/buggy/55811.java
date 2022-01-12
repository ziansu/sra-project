public ImprovedStack reverse() {
    ImprovedStack is = new ImprovedStackImpl(new LinkedList());
    int size = list.size();
    for (int i = 0; i < size; i++) {
        ReturnObject ro = list.get(i);
        is.push(ro.getReturnValue());
    }
    return is;
}