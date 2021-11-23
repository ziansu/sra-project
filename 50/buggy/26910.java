@java.lang.Override
public org.uva.taxfree.model.types.Type getType() {
    if (!(isValid())) {
        throw new java.lang.AssertionError("Either side works since the expression isn't valid anyway.");
    }
    return mLeft.getType();
}