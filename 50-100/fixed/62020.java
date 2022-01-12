private void decrement(T e) {
    java.lang.Integer tally = tallies.get(e);
    tally = (tally == null) ? 0 : tally;
    fireObjectTallyChange(e, tally, (tally - 1));
    tally--;
    if (tally < 0)
        throw new org.jtrfp.trcl.coll.ObjectTallyCollection.NegativeTallyException();
    
    if (tally == 0)
        tallies.remove(e);
    else
        tallies.put(e, tally);
    
}