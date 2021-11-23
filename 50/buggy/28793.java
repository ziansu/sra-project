private void push(clojure.lang.Keyword key, java.lang.Object value) {
    ensureCapacity();
    _stack[((_stackTop)++)] = key;
    _stack[((_stackTop)++)] = value;
}