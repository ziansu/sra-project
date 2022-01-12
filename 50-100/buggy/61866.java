private boolean retryingWebElementAction(java.lang.Runnable action) {
    boolean result = false;
    int attempts = 0;
    while (attempts < 3) {
        try {
            action.run();
            java.lang.System.out.println("pressed");
            result = true;
            break;
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            attempts++;
        }
    } 
    return result;
}