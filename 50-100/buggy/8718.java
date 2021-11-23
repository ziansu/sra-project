@java.lang.Override
public java.lang.Object add(java.lang.Object left, java.lang.Object right) {
    if ((left instanceof java.lang.String) || (right instanceof java.lang.String)) {
        return (left.toString()) + (right.toString());
    }else {
        return super.add(left, right);
    }
}