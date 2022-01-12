@cucumber.api.java.After
public void closeBrowser(cucumber.api.Scenario sc) {
    if (sc.isFailed()) {
        try {
            byte[] screeenshot = graphUiUtil.takescreenAsBiteArray();
            sc.embed(screeenshot, "image/png");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    graphUiUtil.logout();
    java.lang.System.out.println("closed");
}