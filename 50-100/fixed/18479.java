@org.osgi.service.component.annotations.Activate
void activate(org.osgi.service.component.ComponentContext ctx) {
    java.lang.System.out.println("+ Activating OpenTestSuite.Core");
    if ((com.robertkoszewski.ots.OpenTestSuite.main_thread) == null) {
        com.robertkoszewski.ots.OpenTestSuite.main_thread = new java.lang.Thread() {
            @java.lang.Override
            public void run() {
                java.lang.System.out.println("Main Thread Started ++++");
            }
        };
        com.robertkoszewski.ots.OpenTestSuite.main_thread.start();
    }
    com.robertkoszewski.utils.splashscreen.api.SplashScreenManager splash = ((com.robertkoszewski.utils.splashscreen.api.SplashScreenManager) (ctx.locateService("com.robertkoszewski.utils.splashscreen")));
    splash.updateSplashMessage("Splash Test");
}