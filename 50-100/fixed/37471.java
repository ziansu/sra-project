@org.junit.Test
public void testMenuRun() throws java.awt.AWTException {
    spaceinvaders.spaceinvaders_framework.Menu menu2 = new spaceinvaders.spaceinvaders_framework.Menu();
    menu2.runMenu();
    org.junit.Assert.assertNull(menu2.getScoreMenu());
    java.awt.Robot bot = new java.awt.Robot();
    bot.mouseMove(300, 350);
    bot.mousePress(java.awt.event.InputEvent.BUTTON1_MASK);
    bot.mouseRelease(java.awt.event.InputEvent.BUTTON1_MASK);
    org.junit.Assert.assertNotNull(menu2.getScoreMenu());
}