@java.lang.Override
public void ValidateParams() {
    com.applitools.Utils.Validator.givenString(capsFile, "Caps file (-cf)").isSetThen().required(seleniumServerURL, "Selenium server (-se)").notAllowed(browser, "browser (-br)");
    com.applitools.Utils.Validator.givenString(sessionId, "Session id (-id)").isSetThen().notAllowed(browser, "browser (-br)").notAllowed(capsFile, "Caps file (-cf)");
}