@java.lang.Override
public ReturnObject add(int index, java.lang.Object item) {
    if ((validateIndex(index)) == false) {
        return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
    }
    if (item == null) {
        return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
    }
    if ((size) >= (items.length)) {
        enlargeArray();
    }
    items[index] = item;
    (size)++;
    return new ReturnObjectImpl(null);
}