public cern.colt.bitvector.BitVector getValidity(logic.example.Example example) {
    if (!(this.examples.containsKey(example)))
        throw new java.lang.IllegalArgumentException(("Example not in validity table: " + example));
    
    return this.validity.part(this.examples.get(example), 0, 1, this.validity.rows()).toBitVector();
}