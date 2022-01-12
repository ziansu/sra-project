@org.junit.Test
public void testGetSize() {
    accDb = new um.edu.mt.cps2002.assignment.part1.AccountDatabase();
    int qty = 100;
    for (int loops = 0; loops < qty; loops++) {
        accDb.createNewAccount(loops);
        org.junit.Assert.assertEquals((loops + 1), accDb.getSize());
    }
    for (int loops = 0; loops < qty; loops++) {
        accDb.createNewAccount(loops);
        org.junit.Assert.assertEquals(qty, accDb.getSize());
    }
}