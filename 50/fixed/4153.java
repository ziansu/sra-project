@java.lang.Override
public java.lang.Integer getValue() {
    if (leftVal) {
        return leftSort.getValue();
    }else {
        return rightSort.getValue();
    }
}