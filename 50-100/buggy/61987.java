public boolean findYouTubePlayer(org.openqa.selenium.WebDriver driver, org.openqa.selenium.WebElement iframe) {
    boolean flagFound = false;
    try {
        java.lang.String src = iframe.getAttribute("src");
        if (src != null) {
            if (src.toLowerCase().contains("www.youtube.com/embed")) {
                flagFound = true;
                sitechecker.VideoExecute.csvConnector.setYouTubePageUrl(driver.getCurrentUrl());
                java.lang.System.out.println("YouTube player is found");
            }else {
                flagFound = false;
            }
        }
    } catch (java.lang.Exception e) {
    }
    return flagFound;
}