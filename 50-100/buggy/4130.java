private  addMax(int e) {
    int place = (heap.size()) + 1;
    while ((place != 1) && (e > (heap.get((place / 2))))) {
        heap.set(place, heap.get((place / 2)));
        place /= 2;
    } 
    heap.set(place, e);
}