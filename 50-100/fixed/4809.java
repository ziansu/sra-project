protected int obtainRandomMsgsPosition(java.util.List<org.openqa.selenium.WebElement> msgs) {
    int randomPosition = com.blackwolves.seeder.YahooRunnable.randInt(0, ((msgs.size()) >= 50 ? 49 : (msgs.size()) == 0 ? 0 : (msgs.size()) - 1));
    com.blackwolves.seeder.YahooRunnable.logger.info(("*****************obtainRandomMsgsPosition : " + randomPosition));
    return randomPosition;
}