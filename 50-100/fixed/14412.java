protected void elementalToSemantic() {
    if (!(isSparse)) {
        pitt.search.semanticvectors.vectors.BinaryVector.logger.warning(("Tried to transform an elemental vector which is not in fact elemental." + "This may be a programming error."));
        return ;
    }
    votingRecord = new java.util.ArrayList<org.apache.lucene.util.FixedBitSet>();
    votingRecord.add(((org.apache.lucene.util.FixedBitSet) (bitSet.clone())));
    totalNumberOfVotes.set(1);
    tempSet = new org.apache.lucene.util.FixedBitSet(dimension);
    isSparse = false;
}