public boolean contains(com.oracle.truffle.r.runtime.data.RComplex val) {
    for (int i = 0; i < (index); i++) {
        if (((backingArray[(i << 1)]) == (val.getRealPart())) && ((backingArray[((i << 1) + 1)]) == (val.getImaginaryPart()))) {
            return true;
        }
    }
    return false;
}