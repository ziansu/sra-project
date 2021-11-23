public ReturnObject add(java.lang.Object item) {
    ReturnObject ro;
    if (item == null) {
        ro = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
    }else {
        if (((this.size) + 1) >= (this.array.length)) {
            extendArray();
        }
        this.array[size] = item;
        (this.size)++;
        ro = new ReturnObjectImpl(item);
    }
    return ro;
}