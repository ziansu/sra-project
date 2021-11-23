public void reserve(int requiredCapacity) {
    if (requiredCapacity > (capacity)) {
        int newCapacity = ((int) (java.lang.Math.min(MAX_CAPACITY, (requiredCapacity * 2L))));
        if (requiredCapacity <= newCapacity) {
            try {
                reserveInternal(newCapacity);
            } catch (java.lang.OutOfMemoryError outOfMemoryError) {
                throwUnsupportedException(newCapacity, requiredCapacity, outOfMemoryError);
            }
        }else {
            throwUnsupportedException(newCapacity, requiredCapacity, null);
        }
    }
}