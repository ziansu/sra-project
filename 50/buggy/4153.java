@java.lang.Override
public java.lang.Integer getValue() {
    if (leftVal) {
        return leftSort.getVal();
    }else {
        return rightSort.getVal();
    }
}