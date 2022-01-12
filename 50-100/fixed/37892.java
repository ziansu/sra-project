public ReturnObject add(java.lang.Object item) {
    if (item == null) {
        return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
    }else {
        if (((this.size) + 1) >= (this.array.length)) {
            extendArray();
        }
        this.array[size] = item;
        (this.size)++;
        return new ReturnObjectImpl(item);
    }
}