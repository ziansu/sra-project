public static void launchApp(final java.lang.Class<? extends de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport> appClass, final java.lang.Class<? extends de.felixroske.jfxsupport.AbstractFxmlView> view, final de.felixroske.jfxsupport.SplashScreen splashScreen, final java.lang.String[] args) {
    de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport.savedInitialView = view;
    de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport.savedArgs = args;
    if (splashScreen != null) {
        de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport.splashScreen = splashScreen;
    }else {
        de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport.splashScreen = new de.felixroske.jfxsupport.SplashScreen();
    }
    javafx.application.Application.launch(appClass, args);
}