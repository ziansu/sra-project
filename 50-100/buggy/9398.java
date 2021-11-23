public java.lang.Float get() {
    if ((getIndex) == (putIndex)) {
        return null;
    }else {
        float result = data[getIndex];
        getIndex = ((getIndex) + 1) % (capacity);
        return result;
    }
}