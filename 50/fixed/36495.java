@java.lang.Override
public void afterExample(org.concordion.api.listener.ExampleEvent event) {
    takeFinalScreenshotForExample("Example Completed");
    switch (appendMode) {
        case EXAMPLE :
        case NEW_STORYBOARD_SECTION_PER_EXAMPLE :
            storyboard.resetContainers();
            break;
        default :
            break;
    }
    resetCurrentState(true);
}