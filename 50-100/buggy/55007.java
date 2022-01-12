public java.lang.Long safeGet(superkit.language.index.Index index) {
    if (index.isLessThan(this.size)) {
        final superkit.collections.arrays.VariableWidthBitPackedArray array = readArray(index);
        if (array != null) {
            return array.safeGet(index);
        }
    }
    return null;
}