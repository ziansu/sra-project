public void add(boolean value) {
    if ((lib.DebouncedBoolean.queue.size()) == (lib.DebouncedBoolean.windowSize)) {
        lib.DebouncedBoolean.queue.removeFirst();
        lib.DebouncedBoolean.queue.addLast(value);
    }else {
        lib.DebouncedBoolean.queue.addLast(value);
    }
    if (value) {
        (count)++;
    }else {
        (count)--;
    }
}