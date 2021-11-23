public java.lang.Object clone() {
    try {
        gdsc.core.utils.TurboList<?> v = ((gdsc.core.utils.TurboList<?>) (super.clone()));
        v.elementData = java.util.Arrays.copyOf(elementData, size);
        return v;
    } catch (java.lang.CloneNotSupportedException e) {
        throw new java.lang.InternalError();
    }
}