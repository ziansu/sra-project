public <T extends com.takusemba.spotlight.Target> void start(@android.support.annotation.NonNull
android.app.Activity activity, @android.support.annotation.NonNull
T... targets) {
    com.takusemba.spotlight.SpotlightView spotlightView = createSpotlightView(activity);
    setUpSpotlightView(activity, spotlightView, new java.util.ArrayList<>(java.util.Arrays.asList(targets)));
}