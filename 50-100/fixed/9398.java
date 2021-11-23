public java.lang.Float get() {
    if ((getIndex) == (putIndex)) {
        return null;
    }else {
        getIndex = ((getIndex) + 1) % (capacity);
        float result = data[getIndex];
        return result;
    }
}