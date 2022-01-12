@java.lang.Override
public void goTo(com.lyft.scoop.Screen screen) {
    if (screen instanceof com.adriencadet.wanderer.ui.screens.LandingScreen) {
        super.goTo(screen);
        pageRouter.goTo(new com.adriencadet.wanderer.ui.screens.PlaceMapScreen());
    }else
        if ((screen instanceof com.adriencadet.wanderer.ui.screens.PlaceMapScreen) || (screen instanceof com.adriencadet.wanderer.ui.screens.PlaceListScreen)) {
            pageRouter.goTo(screen);
        }else
            if (screen instanceof com.adriencadet.wanderer.ui.screens.PlaceInsightScreen) {
                isInFullscreen = true;
                fullscreenRouter.goTo(screen);
            }else {
                timber.log.Timber.e("Invalid screen");
            }
        
    
}