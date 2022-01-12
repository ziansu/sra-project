@java.lang.Override
public void allocate(int index) {
    if (index >= (_capacity)) {
        if ((_backend.length) == 0) {
            _backend = new java.lang.Object[index];
            _capacity = index;
        }else {
            throw new java.lang.RuntimeException("Not implemented yet!!!");
        }
    }
}