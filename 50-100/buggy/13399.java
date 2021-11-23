public void add(T newInt) {
    _queue.add(newInt);
    int walk = (_queue.size()) - 1;
    while ((walk != 0) && ((_queue.get(walk).compareTo(_queue.get((walk - 1)))) > 0)) {
        _queue.set(walk, _queue.set((walk - 1), _queue.get(walk)));
        walk--;
    } 
}