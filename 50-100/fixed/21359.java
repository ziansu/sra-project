public void set(superkit.language.index.Index index, long value) {
    if ((value & (this.invertedMask)) != 0) {
        this.array = this.array.copyTo(new superkit.collections.arrays.BitPackedArray(superkit.language.count.Bits.toRepresent(value), this.array.size()));
    }
    this.array.set(index, value);
}