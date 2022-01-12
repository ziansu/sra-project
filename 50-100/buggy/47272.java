public java.util.BitSet interestingBits(java.lang.Integer peerid) {
    lock.readLock().lock();
    java.util.BitSet neighbor_bits = this.getBitfield(peerid);
    if (neighbor_bits == null) {
        lock.readLock().unlock();
        return new java.util.BitSet(this.numPieces);
    }
    java.util.BitSet interesting_bits = ((java.util.BitSet) (neighbor_bits.clone()));
    interesting_bits.andNot(this.myBitField);
    lock.readLock().unlock();
    return interesting_bits;
}