protected void elementalToSemantic() {
    if (!(isSparse)) {
        pitt.search.semanticvectors.vectors.BinaryVector.logger.warning(("Tried to transform an elemental vector which is not in fact elemental." + "This may be a programming error."));
        return ;
    }
    votingRecord = new java.util.ArrayList<org.apache.lucene.util.FixedBitSet>();
    votingRecord.add(((org.apache.lucene.util.FixedBitSet) (bitSet.clone())));
    totalNumberOfVotes.set(((int) (java.lang.Math.pow(10, pitt.search.semanticvectors.vectors.BinaryVector.BINARY_VECTOR_DECIMAL_PLACES))));
    tempSet = new org.apache.lucene.util.FixedBitSet(dimension);
    isSparse = false;
}