@org.junit.Test
public void testCaulk() {
    int choice = 2;
    edu.gatech.cs2340.shlat.tests.Player player = new edu.gatech.cs2340.shlat.tests.Player();
    edu.gatech.cs2340.shlat.tests.Party party = new edu.gatech.cs2340.shlat.tests.Party();
    edu.gatech.cs2340.shlat.tests.River river = new edu.gatech.cs2340.shlat.tests.River();
    river.crossRiver(choice, player, party);
    org.junit.Assert.assertEquals(caulkRiver(player, party), river.crossRiver(choice, player, party));
}