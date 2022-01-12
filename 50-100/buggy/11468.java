@java.lang.Override
public int evaluate() {
    if (((first) != null) && ((last) != null)) {
        return (first.evaluate()) + (last.evaluate());
    }else {
        throw new java.lang.IllegalStateException("NO!");
    }
}