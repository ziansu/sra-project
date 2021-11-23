@java.lang.Override
public ReturnObject top() {
    if (isEmpty()) {
        return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
    }else {
        return new ReturnObjectImpl(internalList.get(((internalList.size()) - 1)));
    }
}