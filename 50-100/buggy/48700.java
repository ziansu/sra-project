private void insert(T t, int position) {
    if (((getParentPosition(position)) != (-1)) && ((this.tester.compare(heap[getParentPosition(position)], t)) == 1)) {
        heap[position] = heap[getParentPosition(position)];
        insert(t, getParentPosition(position));
    }else {
        heap[position] = t;
    }
}