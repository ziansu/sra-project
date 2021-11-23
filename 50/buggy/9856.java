public void push(int seconds) {
    cur = seconds;
    stack.push(seconds);
    driver.manage().timeouts().implicitlyWait(cur, java.util.concurrent.TimeUnit.SECONDS);
}