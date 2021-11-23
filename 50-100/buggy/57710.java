public void add(boolean b) {
    if ((lib.DebouncedBoolean.queue.size()) == (lib.DebouncedBoolean.windowSize)) {
        lib.DebouncedBoolean.queue.removeFirst();
        lib.DebouncedBoolean.queue.addLast(b);
    }else {
        lib.DebouncedBoolean.queue.addLast(b);
    }
    if (b) {
        (count)++;
    }else {
        (count)--;
    }
}