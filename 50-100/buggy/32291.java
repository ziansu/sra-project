@org.junit.Test
public void setDateTest() {
    soccerLeaguePD.Game game = new soccerLeaguePD.Game();
    utility.SimpleDate date = new utility.SimpleDate("08/01/2016");
    game.setDate(date);
    utility.SimpleDate date1 = game.getDate();
    org.junit.Assert.assertTrue("Date is not the same", date1.equals(date));
}