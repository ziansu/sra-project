@org.junit.Test
public void testFixHighscoreCountTrue() {
    list.add("1. 600");
    list.add("1. 500");
    list.add("2. 400");
    list.add("3. 300");
    list.add("4. 200");
    org.junit.Assert.assertEquals(lasersharks.Highscores.fixHighscoreCount(list).toString(), "[1. 600, 2. 500, 3. 400, 4. 300, 5. 200]");
}