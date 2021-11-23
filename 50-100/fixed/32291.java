@org.junit.Test
public void setDateTest() {
    soccerLeaguePD.Game game = new soccerLeaguePD.Game();
    java.util.Date date = new java.util.Date();
    game.setDate(date);
    java.util.Date date1 = game.getDate();
    org.junit.Assert.assertTrue("Date is not the same", date1.equals(date));
}