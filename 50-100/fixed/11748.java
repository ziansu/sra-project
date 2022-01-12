@org.junit.Test
public void testJoinCollection() {
    boolean hasData = false;
    HgTupleStream stream = HgDB.join(PartTable.stream().joinOn(PartTable.self(PartTable.ID)), OdetailTable.on.pnos(), HgRelation.IN);
    for (org.mercurydb.queryutils.HgTupleStream.HgTuple t : stream) {
        hasData = true;
        if (!(t.get(OdetailTable.ID).pnos.contains(t.get(PartTable.ID))))
            org.junit.Assert.fail();
        
    }
    if (!hasData)
        org.junit.Assert.fail();
    
}